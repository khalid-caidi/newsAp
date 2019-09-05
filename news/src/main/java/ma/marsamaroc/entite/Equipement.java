package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the EQUIPEMENT database table.
 * 
 */
@Entity
@Table(name="EQUIPEMENT")
public class Equipement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_EQUIPEMENT")
	private String codeEquipement;

	@Column(name="LIBELLE_EQUIPEMENT")
	private String libelleEquipement;
	


	@Column(name="PRINCIPAL")
	private int principal;

	//bi-directional many-to-one association to FamilleEquipement
    @ManyToOne
	@JoinColumn(name="CODE_FAMILLEEQUIPEMENT")
	private FamilleEquipement familleEquipement;

	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	//bi-directional many-to-many association to Prestation
    @ManyToMany
	@JoinTable(
		name="EQUIPEMENT_PRESTATION"
		, joinColumns={
			@JoinColumn(name="CODE_EQUIPEMENT")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CODE_PRESTATION")
			}
		)
	private Set<Prestation> prestations;

	//bi-directional many-to-many association to Main
	@ManyToMany(mappedBy="equipements")
	private Set<Main> mains;

	//bi-directional many-to-many association to Main
	@OneToMany(mappedBy="equipementPrincipal")
	private Set<Main> mainsEquipementPrincipal;

	//bi-directional many-to-one association to MainPanneEquipement
	@OneToMany(mappedBy="id.equipement")
	private Set<MainPanneEquipement> mainPanneEquipements;

	//bi-directional many-to-one association to MainPanneEquipement
	@OneToMany(mappedBy="equipementRemplacement")
	private Set<MainPanneEquipement> mainPanneEquipementremplacement;

	//bi-directional many-to-many association to Groupeposte
    @ManyToMany
	@JoinTable(
		name="EQUIPEMENT_GROUPEPOSTES"
		, joinColumns={
			@JoinColumn(name="CODE_EQUIPEMENT")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CODE_GROUPEPOSTES")
			}
		)
	private Set<Groupeposte> groupepostes;

    public Equipement() {
    }

	public String getCodeEquipement() {
		return this.codeEquipement;
	}

	public void setCodeEquipement(String codeEquipement) {
		this.codeEquipement = codeEquipement;
	}

	public String getLibelleEquipement() {
		return this.libelleEquipement;
	}

	public void setLibelleEquipement(String libelleEquipement) {
		this.libelleEquipement = libelleEquipement;
	}

	public FamilleEquipement getFamilleEquipement() {
		return this.familleEquipement;
	}

	public void setFamilleEquipement(FamilleEquipement familleEquipement) {
		this.familleEquipement = familleEquipement;
	}
	
	public Set<Prestation> getPrestations() {
		return this.prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	
	public Set<Main> getMains() {
		return this.mains;
	}

	public void setMains(Set<Main> mains) {
		this.mains = mains;
	}
	
	public Set<MainPanneEquipement> getMainPanneEquipements() {
		return this.mainPanneEquipements;
	}

	public void setMainPanneEquipements(Set<MainPanneEquipement> mainPanneEquipements) {
		this.mainPanneEquipements = mainPanneEquipements;
	}
	
	public Set<Groupeposte> getGroupepostes() {
		return this.groupepostes;
	}

	public void setGroupepostes(Set<Groupeposte> groupepostes) {
		this.groupepostes = groupepostes;
	}

	public Set<Main> getMainsEquipementPrincipal() {
		return mainsEquipementPrincipal;
	}

	public void setMainsEquipementPrincipal(Set<Main> mainsEquipementPrincipal) {
		this.mainsEquipementPrincipal = mainsEquipementPrincipal;
	}

	public Set<MainPanneEquipement> getMainPanneEquipementremplacement() {
		return mainPanneEquipementremplacement;
	}

	public void setMainPanneEquipementremplacement(
			Set<MainPanneEquipement> mainPanneEquipementremplacement) {
		this.mainPanneEquipementremplacement = mainPanneEquipementremplacement;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	
}