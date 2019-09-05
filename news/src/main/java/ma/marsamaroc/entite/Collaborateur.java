package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the COLLABORATEUR database table.
 * 
 */
@Entity
@Table(name="COLLABORATEUR")
public class Collaborateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MATRICULE_COLLABORATEUR")
	private String matriculeCollaborateur;
	
	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	@Column(name="ISRESPONSABLE")
	private int isresponsable;

	@Column(name="NOM_COLLABORATEUR")
	private String nomCollaborateur;

	@Column(name="PRENOM_COLLABORATEUR")
	private String prenomCollaborateur;

	//bi-directional many-to-one association to Fonction
    @ManyToOne
	@JoinColumn(name="CODE_FONCTION")
	private Fonction fonction;

	//bi-directional many-to-many association to Equipe
	@ManyToMany(mappedBy="membres")
	private Set<Equipe> equipesMembre;

	//bi-directional many-to-one association to Equipe
	@OneToMany(mappedBy="responsable")
	private Set<Equipe> equipesResponsable;

	//bi-directional many-to-one association to Collaborateur
	@OneToMany(mappedBy="id.collaborateur")
	private Set<MainCollaborateur> mainCollaborateur;

	//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="chefEscale")
	private Set<Operation> operationsChefEscale;

	/*//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="collaborateur2")
	private Set<Operation> operations2;*/

    public Collaborateur() {
    }



	public Collaborateur(String matriculeCollaborateur, Terminal terminal,
			int isresponsable, String nomCollaborateur,
			String prenomCollaborateur, Fonction fonction) {
		super();
		this.matriculeCollaborateur = matriculeCollaborateur;
		this.terminal = terminal;
		this.isresponsable = isresponsable;
		this.nomCollaborateur = nomCollaborateur;
		this.prenomCollaborateur = prenomCollaborateur;
		this.fonction = fonction;
	}



	public int getIsresponsable() {
		return this.isresponsable;
	}

	public void setIsresponsable(int isresponsable) {
		this.isresponsable = isresponsable;
	}

	

	public Fonction getFonction() {
		return this.fonction;
	}


	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}


	public String getMatriculeCollaborateur() {
		return matriculeCollaborateur;
	}


	public void setMatriculeCollaborateur(String matriculeCollaborateur) {
		this.matriculeCollaborateur = matriculeCollaborateur;
	}


	public String getNomCollaborateur() {
		return nomCollaborateur;
	}


	public void setNomCollaborateur(String nomCollaborateur) {
		this.nomCollaborateur = nomCollaborateur;
	}


	public String getPrenomCollaborateur() {
		return prenomCollaborateur;
	}


	public void setPrenomCollaborateur(String prenomCollaborateur) {
		this.prenomCollaborateur = prenomCollaborateur;
	}

	public Set<Equipe> getEquipesMembre() {
		return equipesMembre;
	}

	public void setEquipesMembre(Set<Equipe> equipesMembre) {
		this.equipesMembre = equipesMembre;
	}

	public Set<Equipe> getEquipesResponsable() {
		return equipesResponsable;
	}

	public void setEquipesResponsable(Set<Equipe> equipesResponsable) {
		this.equipesResponsable = equipesResponsable;
	}

	public Set<Operation> getOperationsChefEscale() {
		return operationsChefEscale;
	}


	public void setOperationsChefEscale(Set<Operation> operationsChefEscale) {
		this.operationsChefEscale = operationsChefEscale;
	}


	public Terminal getTerminal() {
		return terminal;
	}


	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}



	public Set<MainCollaborateur> getMainCollaborateur() {
		return mainCollaborateur;
	}



	public void setMainCollaborateur(Set<MainCollaborateur> mainCollaborateur) {
		this.mainCollaborateur = mainCollaborateur;
	}

	
}