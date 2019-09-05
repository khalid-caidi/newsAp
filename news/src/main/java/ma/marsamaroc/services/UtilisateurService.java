package ma.marsamaroc.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.marsamaroc.dao.interfaces.IUtilisateurDAO;
import ma.marsamaroc.dto.AutorisationDTO;
import ma.marsamaroc.dto.PortDTO;
import ma.marsamaroc.dto.SiteDTO;
import ma.marsamaroc.dto.TerminalDTO;
import ma.marsamaroc.dto.UtilisateurDTO;
import ma.marsamaroc.entite.Utilisateur;
import ma.marsamaroc.services.interfaces.IUtilisateurService;
import ma.marsamaroc.utils.Utilitaires;

@Service
@Transactional("transactionManager")
public class UtilisateurService implements IUtilisateurService {

	@Autowired
	private IUtilisateurDAO userDAO;

	public IUtilisateurDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(IUtilisateurDAO userDAO) {
		this.userDAO = userDAO;
	}

	@Override
	public UtilisateurDTO findUserByUserName(String userName) throws Exception {
		UtilisateurDTO userDTO = new UtilisateurDTO();
		Utilisateur user = userDAO.findUserByUserName(userName);
		if (null != user) {
			BeanUtils.copyProperties(user, userDTO);
		}

		return userDTO;
	}

	@Override
	public List<PortDTO> findAllPortAffectedUser(String userName) throws Exception {
		List<AutorisationDTO> listSiteDTO = userDAO.findAllPortAffectedUser(userName);
		List<PortDTO> listProts = new ArrayList<>();
		if (CollectionUtils.isNotEmpty(listSiteDTO)) {
			Map<String, PortDTO> mapPort = new HashMap<>();
			Map<String, TerminalDTO> mapTerminal = new HashMap<>();
			PortDTO portDTO = null;
			TerminalDTO terminalDTO =null;
			List<TerminalDTO> listTerm = null;
			List<String> listroles = null;
			for (AutorisationDTO autorisation : listSiteDTO) {
				// Port
				if (!mapPort.containsKey(autorisation.getCodPort())) {
					// Port
					portDTO = new PortDTO();
					portDTO.setCodPort(autorisation.getCodPort());
					portDTO.setLibPort(autorisation.getLibPort());
					mapPort.put(autorisation.getCodPort(), portDTO);
					// Terminal
					terminalDTO = new TerminalDTO();
					terminalDTO.setCodTerminal(autorisation.getCodTerminal());
					terminalDTO.setLibTerminal(autorisation.getLibTerminal());
					listTerm = new ArrayList<>();
					listroles = new ArrayList<>();
					listroles.add(autorisation.getCodAction());
					terminalDTO.setRoles(listroles);
					listTerm.add(terminalDTO);
					mapTerminal.put(autorisation.getCodTerminal(), terminalDTO);
					mapPort.get(autorisation.getCodPort()).setListTerminal(listTerm);
				}else{
					portDTO = mapPort.get(autorisation.getCodPort());
					listTerm = portDTO.getListTerminal();
					if (mapTerminal.containsKey(autorisation.getCodTerminal())) {
						terminalDTO = mapTerminal.get(autorisation.getCodTerminal());
						listroles = terminalDTO.getRoles();
						if (!listroles.contains(autorisation.getCodAction())) {
							listroles.add(autorisation.getCodAction());
						}
					}else{
						terminalDTO = new TerminalDTO();
						terminalDTO.setCodTerminal(autorisation.getCodTerminal());
						terminalDTO.setLibTerminal(autorisation.getLibTerminal());
						listroles = new ArrayList<>();
						listroles.add(autorisation.getCodAction());
						terminalDTO.setRoles(listroles);
						listTerm.add(terminalDTO);
						mapTerminal.put(autorisation.getCodTerminal(), terminalDTO);
						mapPort.get(autorisation.getCodPort()).setListTerminal(listTerm);
					}
				}
				// Terminal & Action
				
			}
			listProts = new ArrayList<>(mapPort.values());

		}
		return listProts;
	}

	@Override
	public Set<String> findAllRoleCodeSiteByIdProfil(Integer idProfil) throws Exception {
		return userDAO.findAllRoleCodeSiteByIdProfil(idProfil);
	}

}
