package ma.marsamaroc.services.interfaces;

import java.util.List;

import ma.marsamaroc.dto.ProfilDTO;
import ma.marsamaroc.entite.Profil;



/**
 * 
 * @author LABAL
 *
 */
public interface IProfilService {
	
	
	
	
	
	/**
	 * DESCRIPTION : RÉCUPÉRER LA LISTE DES PROFILES
	 * DATE DERNIERE MODIF : 04 Jan. 2017 
	 * PROJET : Gestion Des Tarifs
	 * AUTEUR : LABAL
	 * 
	 * @return List<FamilleDTO>
	 * @throws Exception
	 */
	List<ProfilDTO> findAllProfils() throws Exception;
	
	
	/**
	 * DESCRIPTION : Récupérer un Profil
	 * DATE DERNIERE MODIF : 06 dec. 2016 
	 * PROJET : Gestion Des Tarifs
	 * AUTEUR : LABAL
	 * @param id 
	 * @return Profil
	 */
	
	Profil findProfilById(Integer id);

}
