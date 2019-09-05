package ma.marsamaroc.managed.beans;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.faces.application.FacesMessage;
import javax.faces.application.NavigationHandler;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.apache.commons.collections.comparators.NullComparator;
import org.apache.commons.collections.comparators.ReverseComparator;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Scope;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import ma.marsamaroc.dto.PortDTO;
import ma.marsamaroc.dto.SiteDTO;
import ma.marsamaroc.dto.TerminalDTO;
import ma.marsamaroc.dto.UtilisateurDTO;
import ma.marsamaroc.services.interfaces.IUtilisateurService;
import ma.marsamaroc.spring.security.GrantedAuthorityImpl;
import ma.marsamaroc.utils.Constantes;
import ma.marsamaroc.utils.Utilitaires;


@Component
@Scope("session")
public class UtilisateurController implements Serializable{

	private static final long serialVersionUID = 1L;
	private final static Logger LOGGER = Logger.getLogger(UtilisateurController.class);

	/**
	 * 
	 * @Autowired
	 * 
	 */
	@Autowired
	private IUtilisateurService utilisateurService;
	
	@Autowired
	private MessageSource messageSource;
	
	private UtilisateurDTO currentUser;
	
	
	/**
     * DESCRIPTION : Fonction pour DropDownList Port
     * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
     * AUTEUR : ZGUIOUAR
     *
     */
	public  String goToGestDecompte() {
		return  Constantes.GlobalConstant_Page.GEST_ACCUEIL_PAGE;
	}
	
	
	/**
     * DESCRIPTION : Fonction pour DropDownList Port
     * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
     * AUTEUR : ZGUIOUAR
     *
     */
    @SuppressWarnings("unchecked")
	public void onPortChange() {
    	try{
    		FacesContext facesContext = FacesContext.getCurrentInstance();
    		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
    		String codePort = (String) session.getAttribute(Constantes.GlobalConstant.CODE_PORT);
    		List<PortDTO> listPort = (List<PortDTO>) session.getAttribute(Constantes.GlobalConstant.LIST_PORTS);
    		for (PortDTO portDTO : listPort) {
				if(codePort.equals(portDTO.getCodPort())){
					session.setAttribute(Constantes.GlobalConstant.LIST_TERMINAUX, portDTO.getListTerminal());
					session.setAttribute(Constantes.GlobalConstant.CODE_TERMINAL, portDTO.getListTerminal().get(0).getCodTerminal());
					session.setAttribute(Constantes.GlobalConstant.CODE_PORT, portDTO.getCodPort());
					session.setAttribute(Constantes.GlobalConstant.LIB_PORT, portDTO.getLibPort());
					onTerminalChange();
					break;
				}
			}
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,  Constantes.GlobalConstant.ERREUR,  e.getMessage() ));
            LOGGER.error(e);
        }
    }
    
	 /**
     * DESCRIPTION : Fonction pour DropDownList Port
     * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
	 * AUTEUR : ZGUIOUAR
     *
     */
    @SuppressWarnings("unchecked")
	public void onTerminalChange() {
    	try{
    		FacesContext facesContext = FacesContext.getCurrentInstance();
    		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
    		Authentication authp = SecurityContextHolder.getContext().getAuthentication();
    		String codeTerminal = (String) session.getAttribute(Constantes.GlobalConstant.CODE_TERMINAL);
    		List<TerminalDTO> listTerminal = (List<TerminalDTO>) session.getAttribute(Constantes.GlobalConstant.LIST_TERMINAUX);
    		for (TerminalDTO terminalDTO : listTerminal) {
    			if(codeTerminal.equals(terminalDTO.getCodTerminal())){
    				List<String> roles = terminalDTO.getRoles();
    				if (CollectionUtils.isNotEmpty(roles)) {
						Set<GrantedAuthority> updatedAuthorities = new HashSet<GrantedAuthority>();
						for (String role : roles) {
							updatedAuthorities.add(new GrantedAuthorityImpl(role));
						}
						Authentication newAuth = new UsernamePasswordAuthenticationToken(authp.getPrincipal(), authp.getCredentials(),updatedAuthorities);
						SecurityContextHolder.getContext().setAuthentication(newAuth);
					}else{
						LOGGER.info("L'utilisateur n'a pas d'autorité reconnue. - User : " + authp.getName());
					}
					break;
				}
				
			}
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,  Constantes.GlobalConstant.ERREUR,  e.getMessage() ));
            LOGGER.error(e);
        }
    	FacesContext context = FacesContext.getCurrentInstance();
    	NavigationHandler nh = FacesContext.getCurrentInstance().getApplication().getNavigationHandler();
    	nh.handleNavigation(context, null, Constantes.GlobalConstant_Page.GEST_ACCUEIL_PAGE + "?faces-redirect=true");
    }
	
	
	public UtilisateurDTO getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(UtilisateurDTO currentUser) {
		this.currentUser = currentUser;
	}

}
