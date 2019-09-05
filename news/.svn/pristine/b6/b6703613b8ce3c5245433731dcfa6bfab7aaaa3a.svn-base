package ma.marsamaroc.spring.security;

import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.comparators.ComparatorChain;
import org.apache.commons.collections.comparators.NullComparator;
import org.apache.commons.collections.comparators.ReverseComparator;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import ma.marsamaroc.dto.PortDTO;
import ma.marsamaroc.dto.SiteDTO;
import ma.marsamaroc.dto.TerminalDTO;
import ma.marsamaroc.services.interfaces.IUtilisateurService;
import ma.marsamaroc.utils.Constantes;

//@Service("authenticationSuccessHandler")
public class AuthenticationSuccessHandler
		implements org.springframework.security.web.authentication.AuthenticationSuccessHandler {

	private final static Logger LOGGER = Logger.getLogger(AuthenticationSuccessHandler.class);

	@Autowired
	private IUtilisateurService utilisateurService;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest req, HttpServletResponse res, Authentication auth_)
			throws IOException, ServletException {
		String pageAccueil = Constantes.GlobalConstant_Page.GEST_ACCUEIL_PAGE;
		try {
			Authentication authp = SecurityContextHolder.getContext().getAuthentication();
			// Liste des autorités 
			List<PortDTO> listProts = utilisateurService.findAllPortAffectedUser(authp.getName());
			if (CollectionUtils.isNotEmpty(listProts)) {
				List<TerminalDTO> listTerminal = listProts.get(0).getListTerminal();
				
				String codePort = listProts.get(0).getCodPort();
				String libPort = listProts.get(0).getLibPort();
				String codeTerminal = listTerminal.get(0).getCodTerminal();
				Set<String> roles = new HashSet<>(listTerminal.get(0).getRoles());
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
				
				req.getSession().setAttribute(Constantes.GlobalConstant.LIST_PORTS, listProts);
				req.getSession().setAttribute(Constantes.GlobalConstant.LIST_TERMINAUX, listTerminal);
				req.getSession().setAttribute(Constantes.GlobalConstant.CODE_PORT, codePort);
				req.getSession().setAttribute(Constantes.GlobalConstant.CODE_TERMINAL, codeTerminal);
				req.getSession().setAttribute(Constantes.GlobalConstant.USER_NAME,  authp.getName()!= null ? authp.getName().toUpperCase() : "");
				req.getSession().setAttribute(Constantes.GlobalConstant.LIB_PORT, libPort);
				req.getSession().setAttribute(Constantes.GlobalConstant.CODE_PORT, codePort);
			}
			res.sendRedirect(req.getContextPath() + pageAccueil);
		} catch (Exception e) {
			res.sendRedirect(req.getContextPath() + "/login.xhtml?state=failure");
			LOGGER.error(e);
		}
	}
}
