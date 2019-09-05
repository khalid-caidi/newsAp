package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the PROFIL database table.
 * 
 */
@Entity
@Table(name="PROFIL")
public class Profil implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_PROFIL")
	private String codeProfil;

	@Column(name="DESCRIPTION_PROFIL")
	private String descriptionProfil;

	//bi-directional many-to-one association to UtilisateurProfilTerminal
	@OneToMany(mappedBy="id.profil")
	private Set<UtilisateurProfilTerminal> utilisateurProfilTerminals;

	//bi-directional many-to-many association to Action
	@ManyToMany
	@JoinTable(
			name="ACTION_PROFIL"
			, joinColumns={
				@JoinColumn(name="CODE_PROFIL")
				}
			, inverseJoinColumns={
				@JoinColumn(name="CODE_ACTION")
				}
			)
	private Set<Action> actions;

    public Profil() {
    }

	public String getCodeProfil() {
		return this.codeProfil;
	}

	public void setCodeProfil(String codeProfil) {
		this.codeProfil = codeProfil;
	}

	public String getDescriptionProfil() {
		return this.descriptionProfil;
	}

	public void setDescriptionProfil(String descriptionProfil) {
		this.descriptionProfil = descriptionProfil;
	}

	public Set<UtilisateurProfilTerminal> getUtilisateurProfilTerminals() {
		return this.utilisateurProfilTerminals;
	}

	public void setUtilisateurProfilTerminals(Set<UtilisateurProfilTerminal> utilisateurProfilTerminals) {
		this.utilisateurProfilTerminals = utilisateurProfilTerminals;
	}
	
	public Set<Action> getActions() {
		return this.actions;
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}
	
}