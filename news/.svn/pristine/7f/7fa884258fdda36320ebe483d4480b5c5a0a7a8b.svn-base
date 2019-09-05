package ma.marsamaroc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.marsamaroc.dao.interfaces.IProfilDAO;
import ma.marsamaroc.dto.ProfilDTO;
import ma.marsamaroc.entite.Profil;
import ma.marsamaroc.services.interfaces.IProfilService;



@Service
@Transactional("transactionManager")
public class ProfilService implements IProfilService{
	
	
	@Autowired
	private IProfilDAO profilDAO;
	
	public IProfilDAO getProfilDAO() {
		return profilDAO;
	}






	@Override
	public List<ProfilDTO> findAllProfils() throws Exception {
		return profilDAO.findAllProfils();
	}






	@Override
	public Profil findProfilById(Integer id) {
		return profilDAO.rechercherParKP(id);
	}
	
	

}
