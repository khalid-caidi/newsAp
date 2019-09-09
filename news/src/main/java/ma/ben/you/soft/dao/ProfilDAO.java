//package ma.ben.you.soft.dao;
//
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.transform.Transformers;
//import org.springframework.stereotype.Repository;
//
//import ma.ben.you.soft.dao.interfaces.IProfilDAO;
//import ma.ben.you.soft.dto.ProfilDTO;
//import ma.ben.you.soft.entite.Profil;
//
//@Repository
//public class ProfilDAO extends Dao<Profil> implements IProfilDAO {
//	
//	
//
//	
//	public ProfilDAO() {
//		super(Profil.class);
//
//	}
//
//	
//	@Override
//	@SuppressWarnings("unchecked")
//	public List<ProfilDTO> findAllProfils() throws Exception {
//		
//		StringBuilder req = new StringBuilder()
//							.append("select p.idProfil as idProfil, ")
//							.append("p.codProfil as codProfil, ")
//							.append("p.libProfil as libProfil ")
//							.append("from Profil p");
//		
//		return entityManager.unwrap(Session.class)
//							.createQuery(req.toString())
//							.setResultTransformer(Transformers.aliasToBean(ProfilDTO.class)).list();
//	}
//
//}
