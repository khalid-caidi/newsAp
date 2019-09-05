package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the TERMINAL database table.
 * 
 */
@Entity
@Table(name="TERMINAL")
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_TERMINAL")
	private String codeTerminal;

	@Column(name="DESCRIPTION_TERMINAL")
	private String descriptionTerminal;

	//bi-directional many-to-many association to Commande
	@OneToMany(mappedBy="terminal")
	private Set<Commande> commandes;

	//bi-directional many-to-many association to Equipement
	@OneToMany(mappedBy="terminal")
	private Set<Equipement> equipements;

	//bi-directional many-to-many association to Equipe
	@OneToMany(mappedBy="terminal")
	private Set<Accessoire> accessoires;

	//bi-directional many-to-many association to Collaborateur
	@OneToMany(mappedBy="terminal")
	private Set<Collaborateur> collaborateurs;

	//bi-directional many-to-many association to Equipe
	@OneToMany(mappedBy="terminal")
	private Set<Equipe> equipes;

	//bi-directional many-to-one association to Groupeposte
	@OneToMany(mappedBy="terminal")
	private Set<Groupeposte> groupepostes;

	//bi-directional many-to-one association to Organisationtravail
	@OneToMany(mappedBy="terminal")
	private Set<Organisationtravail> organisationtravails;

	//bi-directional many-to-one association to Planroulement
	@OneToMany(mappedBy="terminal")
	private Set<Planroulement> planroulements;

	//bi-directional many-to-one association to UtilisateurProfilTerminal
	@OneToMany(mappedBy="id.terminal")
	private Set<UtilisateurProfilTerminal> utilisateurProfilTerminal;

	//bi-directional many-to-one association to Port
    @ManyToOne
	@JoinColumn(name="CODE_PORT")
	private Port port;

    public Terminal() {
    }

	public String getCodeTerminal() {
		return this.codeTerminal;
	}

	public void setCodeTerminal(String codeTerminal) {
		this.codeTerminal = codeTerminal;
	}

	public String getDescriptionTerminal() {
		return this.descriptionTerminal;
	}

	public void setDescriptionTerminal(String descriptionTerminal) {
		this.descriptionTerminal = descriptionTerminal;
	}

	public Set<Commande> getCommandes() {
		return this.commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}
	
	public Set<Groupeposte> getGroupepostes() {
		return this.groupepostes;
	}

	public void setGroupepostes(Set<Groupeposte> groupepostes) {
		this.groupepostes = groupepostes;
	}
	
	public Set<Organisationtravail> getOrganisationtravails() {
		return this.organisationtravails;
	}

	public void setOrganisationtravails(Set<Organisationtravail> organisationtravails) {
		this.organisationtravails = organisationtravails;
	}
	
	public Set<Planroulement> getPlanroulements() {
		return this.planroulements;
	}

	public void setPlanroulements(Set<Planroulement> planroulements) {
		this.planroulements = planroulements;
	}
	
	public Port getPort() {
		return this.port;
	}

	public void setPort(Port port) {
		this.port = port;
	}

	public Set<UtilisateurProfilTerminal> getUtilisateurProfilTerminal() {
		return utilisateurProfilTerminal;
	}

	public void setUtilisateurProfilTerminal(
			Set<UtilisateurProfilTerminal> utilisateurProfilTerminal) {
		this.utilisateurProfilTerminal = utilisateurProfilTerminal;
	}

	public Set<Collaborateur> getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(Set<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	public Set<Equipe> getEquipes() {
		return equipes;
	}

	public void setEquipes(Set<Equipe> equipes) {
		this.equipes = equipes;
	}

	public Set<Equipement> getEquipements() {
		return equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}

	public Set<Accessoire> getAccessoires() {
		return accessoires;
	}

	public void setAccessoires(Set<Accessoire> accessoires) {
		this.accessoires = accessoires;
	}
	
}