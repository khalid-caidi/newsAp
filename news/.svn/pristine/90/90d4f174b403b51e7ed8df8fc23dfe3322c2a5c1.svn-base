package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the UTILISATEUR_PROFIL_TERMINAL database table.
 * 
 */
@Embeddable
public class UtilisateurProfilTerminalPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;


    public UtilisateurProfilTerminalPK() {
    }
    
	//bi-directional many-to-one association to Profil
    @ManyToOne
	@JoinColumn(name="CODE_PROFIL")
	private Profil profil;

	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	//bi-directional many-to-one association to Utilisateur
    @ManyToOne
	@JoinColumn(name="ID_UTILISATEUR")
	private Utilisateur utilisateur;
	
	public Profil getProfil() {
		return this.profil;
	}

	public void setProfil(Profil profil) {
		this.profil = profil;
	}
	
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UtilisateurProfilTerminalPK)) {
			return false;
		}
		UtilisateurProfilTerminalPK castOther = (UtilisateurProfilTerminalPK)other;
		return 
			(this.utilisateur.getIdUtilsateur() == castOther.utilisateur.getIdUtilsateur())
			&& this.profil.getCodeProfil().equals(castOther.profil.getCodeProfil())
			&& this.terminal.getCodeTerminal().equals(castOther.terminal.getCodeTerminal());

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.utilisateur.getIdUtilsateur();
		hash = hash * prime + this.profil.getCodeProfil().hashCode();
		hash = hash * prime + this.terminal.getCodeTerminal().hashCode();
		
		return hash;
    }
}