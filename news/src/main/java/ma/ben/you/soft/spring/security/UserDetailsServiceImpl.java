package ma.ben.you.soft.spring.security;

import java.util.HashSet;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import ma.ben.you.soft.dto.UtilisateurDTO;
import ma.ben.you.soft.services.interfaces.IUtilisateurService;
import ma.ben.you.soft.utils.Utilitaires;



public class UserDetailsServiceImpl implements UserDetailsService {
	
	private final static Logger LOGGER = Logger.getLogger(UserDetailsServiceImpl.class);
	
	@Autowired
	private IUtilisateurService utilisateurService;

	public IUtilisateurService getUtilisateurService() {
		return utilisateurService;
	}




	/**
     * Locates the user based on the username. In the actual implementation, the search may possibly be case
     * insensitive, or case insensitive depending on how the implementation instance is configured. In this case, the
     * <code>UserDetails</code> object that comes back may have a username that is of a different case than what was
     * actually requested..
     *
     * @param username the username identifying the user whose data is required.
     *
     * @return a fully populated user record (never <code>null</code>)
     *
     * @throws UsernameNotFoundException if the user could not be found or the user has no GrantedAuthority
     * @throws DataAccessException if user could not be found for a repository-specific reason
     */
	public UserDetails loadUserByUsername(String userName)
			throws UsernameNotFoundException {
		try {
			// get user by username
			UtilisateurDTO user = utilisateurService.findUserByUserName(userName);
			if (user == null || user.getPassword().isEmpty()) {
				throw new UsernameNotFoundException("user could not be found : " + userName);
			}
			return new UserDetailsImpl(userName, Utilitaires.getPasswordEncrypted(user.getPassword()), new HashSet<GrantedAuthority>());
		} catch (Exception e) {
			LOGGER.error(e);
		}
		return new UserDetailsImpl(null, null, null);
	}
}
