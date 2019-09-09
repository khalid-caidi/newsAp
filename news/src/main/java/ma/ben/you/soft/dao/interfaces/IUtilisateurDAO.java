package ma.ben.you.soft.dao.interfaces;

import java.util.List;
import java.util.Set;

import ma.ben.you.soft.dto.AutorisationDTO;
import ma.ben.you.soft.entite.Utilisateur;


/**
 * 
 * @author ZGUIOUAR
 *
 */
public interface IUtilisateurDAO extends IDao<Utilisateur>{
	
	
	/**
	 * DESCRIPTION : Trouver l'utilisateur par nom 
	 * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
	 * AUTEUR : ZGUIOUAR
	 *
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	Utilisateur findUserByUserName(String userName) throws Exception;
	
	/**
	 * DESCRIPTION : Trouver tous les actions affectés à l'utilisateur choisi
	 * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	List<AutorisationDTO> findAllPortAffectedUser(String userName) throws Exception;
	
	/**
	 * DESCRIPTION : Trouver tous les rôles affectés au profil choisi
	 * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param idProfil
	 * @return
	 * @throws Exception
	 */
	Set<String> findAllRoleCodeSiteByIdProfil(Integer idProfil) throws Exception;
	
}
