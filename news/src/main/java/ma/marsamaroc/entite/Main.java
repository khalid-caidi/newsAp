package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the [MAIN] database table.
 * 
 */
@Entity
@Table(name="[MAIN]")
public class Main implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_MAIN")
	@GeneratedValue
	private int idMain;

	
	@Column(name="NOMBRE_SOUSTRAITANT")
	private int nombreSousTraitants;

	//bi-directional many-to-many association to Equipement
    @ManyToMany
	@JoinTable(
		name="MAIN_EQUIPEMENT"
		, joinColumns={
			@JoinColumn(name="ID_MAIN")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CODE_EQUIPEMENT")
			}
		)
	private Set<Equipement> equipements;

	//bi-directional many-to-one association to Equipement
    @ManyToOne
	@JoinColumn(name="CODE_EQUIPEMENT_PRINCIPAL")
	private Equipement equipementPrincipal;

	//bi-directional many-to-one association to Operation
    @ManyToOne
	@JoinColumn(name="ID_OPERATION")
	private Operation operation;

	//bi-directional many-to-one association to MainCollaborateur
    @OneToMany(mappedBy="id.main")
	private Set<MainCollaborateur> mainCollaborateur;

	//bi-directional many-to-one association to MainPanneEquipement
	@OneToMany(mappedBy="id.main")
	private Set<MainPanneEquipement> mainPanneEquipements;

	//bi-directional many-to-one association to MainArret
	@OneToMany(mappedBy="id.main")
	private Set<MainArret> mainArrets;

	// DEBUT_V0R0_M0007_KRIMOU_20/04/2013
	/*//bi-directional many-to-many association to Accessoire
    @ManyToMany
	@JoinTable(
		name="MAIN_ACCESSOIRE"
		, joinColumns={
			@JoinColumn(name="ID_MAIN")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CODE_ACCESSOIRE")
			}
		)
	private Set<Accessoire> accessoires;*/
	@OneToMany(mappedBy="id.main")
	private Set<MainAccessoire> mainAccessoires;
	// DEFIN_V0R0_M0007_KRIMOU_20/04/2013
	
    //bi-directional many-to-one association to CommandeMarchandise
  	@OneToMany(mappedBy="id.main")
  	private Set<MainMarchandise> mainMarchandises;
    
    public Main() {
    }

	public int getIdMain() {
		return this.idMain;
	}

	public void setIdMain(int idMain) {
		this.idMain = idMain;
	}


	public Set<Equipement> getEquipements() {
		return this.equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}
	
	public Operation getOperation() {
		return this.operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}
	public Set<MainPanneEquipement> getMainPanneEquipements() {
		return this.mainPanneEquipements;
	}

	public void setMainPanneEquipements(Set<MainPanneEquipement> mainPanneEquipements) {
		this.mainPanneEquipements = mainPanneEquipements;
	}
	
	public Set<MainArret> getMainArrets() {
		return this.mainArrets;
	}

	public void setMainArrets(Set<MainArret> mainArrets) {
		this.mainArrets = mainArrets;
	}

	// DEBUT_V0R0_M0007_KRIMOU_20/04/2013
	/*public Set<Accessoire> getAccessoires() {
		return this.accessoires;
	}

	public void setAccessoires(Set<Accessoire> accessoires) {
		this.accessoires = accessoires;
	}*/

	public Set<MainAccessoire> getMainAccessoires() {
		return mainAccessoires;
	}

	public void setMainAccessoires(Set<MainAccessoire> mainAccessoires) {
		this.mainAccessoires = mainAccessoires;
	}
	// FIN_V0R0_M0007_KRIMOU_20/04/2013

	public Equipement getEquipementPrincipal() {
		return equipementPrincipal;
	}

	public void setEquipementPrincipal(Equipement equipementPrincipal) {
		this.equipementPrincipal = equipementPrincipal;
	}

	public Set<MainCollaborateur> getMainCollaborateur() {
		return mainCollaborateur;
	}

	public void setMainCollaborateur(Set<MainCollaborateur> mainCollaborateur) {
		this.mainCollaborateur = mainCollaborateur;
	}

	public int getNombreSousTraitants() {
		return nombreSousTraitants;
	}

	public void setNombreSousTraitants(int nombreSousTraitants) {
		this.nombreSousTraitants = nombreSousTraitants;
	}

	public Set<MainMarchandise> getMainMarchandises() {
		return mainMarchandises;
	}

	public void setMainMarchandises(Set<MainMarchandise> mainMarchandises) {
		this.mainMarchandises = mainMarchandises;
	}
	
}