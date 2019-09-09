package ma.ben.you.soft.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;

/**
 * Classe qui permet le traitement utilitaire 
 * CRÉE LE : 01 dec. 2016 
 * PROJET : Gestion administration ressources 
 * AUTEUR : ZGUIOUAR
 * 
 * @author ZGUIOUAR
 *
 */
public abstract class Utilitaires {
	
	private final static Logger LOGGER = Logger.getLogger(Utilitaires.class);
	
	public static final String LOGGING_NAME = "loggingName";
	public static final String APPLICATION_CONFIG_FILE = "application";

	/**
	 * DESCRIPTION : Méthode permet de copier un objet vers un autre du même type
	 * DATE DERNIERE MODIF : 01 dec. 2016 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param dest
	 * @param orig
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	public static void copyProperties(Object dest, final Object orig)
			throws IllegalAccessException, InvocationTargetException {
		BeanUtils.copyProperties(dest, orig);
	}
	
	/**
	 * DESCRIPTION : Méthode permet de récupérer le nom d'utilisateur connecté
	 * DATE DERNIERE MODIF : 01 dec. 2016 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @return
	 */
	public static String getCurrentUser() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		return null != auth && StringUtils.isNotBlank(auth.getName()) ? auth.getName().toUpperCase()
				: Constantes.GlobalConstant.CHAINE_VIDE;
	}
	
	/**
	 * DESCRIPTION : Méthode permet de récupérer current local 
	 * DATE DERNIERE MODIF : 07 dec. 2016 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @return
	 */
	public static Locale getCurrentLocal(){
		return LocaleContextHolder.getLocale();
	}
	
	/**
	 * DESCRIPTION : Méthode permet de récupérer la valeur associée à la clé passée en paramètre
	 * DATE DERNIERE MODIF : 07 dec. 2016 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param messageSource
	 * @param key
	 * @param param
	 * @return
	 */
	public static String getMessage(MessageSource messageSource,String key, Object[] param){
		return messageSource.getMessage(key, param, key, getCurrentLocal());
	}
	
	/**
	 * 
	 * DESCRIPTION : Retourne la valeur correspondant au paramétre paramId dans le fichier
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param paramId
	 * @param propertyFileName
	 * @return
	 */
	public static String getProperty(String paramId, String propertyFileName) {
		try {
			if (paramId == null) {
				return null;
			}
			return ResourceBundle.getBundle(propertyFileName)
					.getString(paramId);
		} catch (MissingResourceException mre) {
			LOGGER.error(mre);
		}
		return null;
	}
	
	/**
	 * 
	 * DESCRIPTION : encrypter le mot de passe 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param pwdOrig
	 * @return
	 * @throws NoSuchAlgorithmException
	 */
	public static String getPasswordEncrypted(final String pwdOrig)
			throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("SHA-1");
		md.update(pwdOrig.getBytes());
		byte[] digest = md.digest();
		StringBuilder sb = new StringBuilder();
		for (byte b : digest) {
			sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

	
	
	/**
	 * 
	 * DESCRIPTION : 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param status
	 * @return
	 */
	public static boolean isError(HttpStatus status) {
        HttpStatus.Series series = status.series();
        return (HttpStatus.Series.CLIENT_ERROR.equals(series)
                || HttpStatus.Series.SERVER_ERROR.equals(series));
    }
	
	/**
	 * 
	 * DESCRIPTION : methode permet de retourner un double avec 2 chiffres
	 * apres la virgule sous forme d'une chaine de caracteres DATE DERNIERE
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param value
	 * @return String
	 */
	public static final String getStringFromDouble( Double value) {
		try {
			if (value == null || value.isNaN()) {
				return "0.00";
			}
			DecimalFormat df = new DecimalFormat("0.00");
			df.setMaximumFractionDigits(2);
			return df.format(value).replace(',', '.');
		} catch (Exception e) {
			LOGGER.error(new Exception("La valeur initial est : " + value));
			LOGGER.error(e);
		}
		return "0.00";
	}

	/**
	 * 
	 * DESCRIPTION : 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param value
	 * @param pattern
	 * @return
	 */
	public static String getString(final Date value, String pattern) {
		if (StringUtils.isBlank(pattern)) {
			pattern = Constantes.GlobalConstant.DATE_PATTERN_WITHSLASH;
		}
		if (value == null) {
			return null;
		}
		return dateToString(value, pattern);
	}
	
	/**
	 * 
	 * DESCRIPTION : 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static final String dateToString(final Date date, final String pattern) {
		try {
			if (date != null) {
				SimpleDateFormat simpleDate = new SimpleDateFormat(pattern,
						Locale.FRANCE);
				return simpleDate.format(date);
			}
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
		return null;
	}
	
	/**
	 * 
	 * DESCRIPTION : Verifier si le text est numérique 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		return str.matches("-?\\d+(\\.\\d+)?"); // match a number with optional
												// '-' and decimal.
	}
	
	/**
	 * 
	 * DESCRIPTION : 
	 * DATE DERNIERE MODIF :  06 janv. 2017 
	 * PROJET : Gestion administration ressources
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param value
	 * @return
	 */
	public static Integer getInteger(String value) {
		return StringUtils.isNotEmpty(value) ? Integer.valueOf(value) : 0;
	}

	
	
	
	/**
	 * 
	 * DESCRIPTION : 
	 * DATE DERNIERE MODIF :  24 Fév. 2017 
	 * PROJET : Gestion Décomptes
	 * AUTEUR : LABAL
	 * 
	 * @param dateDebut,dateFin
	 * @return
	 */
	public static String montantEnLettre(Double montant,String Devise,String FractionDevise) {

		String montantLettre="",montantStr;
		Integer integralPart = 0,fractionalPart = 0;
		try {
			
			if(null != montant){
				ULocale locale = new ULocale("Fr"); 
				NumberFormat formatter = new RuleBasedNumberFormat(locale, RuleBasedNumberFormat.SPELLOUT);
				montantStr = montant.toString();
				montantStr = String.format("%.2f", montant);
				String [] tabStr = montantStr.split(Pattern.quote(","));
				
				if (tabStr != null){
					if (tabStr.length > 0){
						integralPart = Integer.parseInt(tabStr[0]);
					}
					if (tabStr.length > 1){
						fractionalPart = Integer.parseInt(tabStr[1]);
					}
				}
				montantLettre = formatter.format(integralPart).toString()+" "+Devise;
				
				if(fractionalPart>0){
					montantLettre+=" ET ";
					montantLettre+= formatter.format(fractionalPart).toString()+" "+FractionDevise;	
				}
			}
		} catch (Exception e) {
			return "Erreur de Calcule du montant en lettre";
		}
		return montantLettre.toUpperCase();
	}
	
	
	public static String getUrlLogoMarsaMaroc(){
		ServletContext servletContext = (ServletContext) FacesContext.getCurrentInstance().getExternalContext().getContext();
		return  servletContext.getRealPath(ConstantesExcel.URL_LOGO_IMG);
	}
}
