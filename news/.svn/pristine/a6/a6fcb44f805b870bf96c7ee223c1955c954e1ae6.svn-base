package ma.marsamaroc.services.interfaces;

import java.util.List;
import java.util.Set;

import ma.marsamaroc.dto.PortDTO;
import ma.marsamaroc.dto.UtilisateurDTO;

public interface IUtilisateurService {

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
	UtilisateurDTO findUserByUserName(String userName) throws Exception;

	/**
	 * DESCRIPTION : Trouver tous les sites affectés à l'utilisateur choisi
	 * DATE DERNIERE MODIF : 27 Jan. 2017
	 * PROJET : Gestion administration ressource
	 * AUTEUR : ZGUIOUAR
	 * 
	 * @param userName
	 * @return
	 * @throws Exception
	 */
	List<PortDTO> findAllPortAffectedUser(String userName) throws Exception;

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
