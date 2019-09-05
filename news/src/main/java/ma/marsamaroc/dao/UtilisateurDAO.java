package ma.marsamaroc.dao;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Query;

import org.apache.commons.collections.CollectionUtils;
import org.hibernate.Session;
import org.hibernate.transform.Transformers;
import org.springframework.stereotype.Repository;

import ma.marsamaroc.dao.interfaces.IUtilisateurDAO;
import ma.marsamaroc.dto.AutorisationDTO;
import ma.marsamaroc.dto.UtilisateurDTO;
import ma.marsamaroc.entite.Utilisateur;
import ma.marsamaroc.utils.Constantes;
import ma.marsamaroc.utils.Utilitaires;


@Repository
public class UtilisateurDAO extends Dao<Utilisateur> implements IUtilisateurDAO {

	public UtilisateurDAO() {
		super(Utilisateur.class);
	}

	
	@Override
	@SuppressWarnings("unchecked")
	public Utilisateur findUserByUserName(String userName) throws Exception {
			Query query = (Query) entityManager
					.createNamedQuery("Utilisateur.findUserByUserName");
			query.setParameter(1, userName);
			List<Utilisateur> listUser = query.getResultList();
			if (CollectionUtils.isNotEmpty(listUser)) {
				return listUser.get(0);
			}
			return null;
	}
	
	@Override
	@SuppressWarnings("unchecked")
	public List<AutorisationDTO> findAllPortAffectedUser(String userName) throws Exception {
		StringBuilder req = new StringBuilder("select")
				// TERMINAL
				.append(" terminal.codeTerminal as codTerminal,  terminal.descriptionTerminal as libTerminal,")
				// PORT
				.append(" port.codePort as codPort, port.descriptionPort as libPort,")
				// ACTION
				.append(" action.codeAction as codAction")
				// FROM Autorisation
				.append(" from UtilisateurProfilTerminal  upt")
				.append(" inner join upt.id.utilisateur user")
				.append(" inner join upt.id.profil profil")
				.append(" inner join upt.id.terminal terminal")
				.append(" inner join terminal.port port")
				.append(" inner join profil.actions action")
				.append("  where user.nomUtilsateur  = :p_userName and coalesce(user.actif,:p_notSupprime) = :p_notSupprime ");
		return entityManager.unwrap(Session.class).createQuery(req.toString()).setParameter("p_userName", userName)
				.setParameter("p_notSupprime", Constantes.GlobalConstant.NOT_SUPPRIME)
				.setResultTransformer(Transformers.aliasToBean(AutorisationDTO.class)).list();
	}
	
	
	@Override
	@SuppressWarnings("unchecked")
	public Set<String> findAllRoleCodeSiteByIdProfil(Integer idProfil) throws Exception {
		try {
			StringBuilder req = new StringBuilder()
					.append("select role.codRole from Profil profil inner join profil.roles role ")
					.append("where profil.idProfil = :p_idProfil");
			List<String> listRoles = entityManager.createQuery(req.toString()).setParameter("p_idProfil", idProfil)
					.getResultList();
			return new HashSet<String>(listRoles);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return new HashSet<String>();

	}

}
