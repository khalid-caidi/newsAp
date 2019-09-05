package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the UTILISATEUR_PROFIL_TERMINAL database table.
 * 
 */
@Entity
@Table(name="UTILISATEUR_PROFIL_TERMINAL")
public class UtilisateurProfilTerminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UtilisateurProfilTerminalPK id;

    public UtilisateurProfilTerminal() {
    }

	public UtilisateurProfilTerminalPK getId() {
		return this.id;
	}

	public void setId(UtilisateurProfilTerminalPK id) {
		this.id = id;
	}
	
	
	
}