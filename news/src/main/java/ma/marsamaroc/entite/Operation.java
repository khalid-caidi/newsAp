package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the [OPERATION] database table.
 * 
 */
@Entity
@Table(name="[OPERATION]")
public class Operation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_OPERATION")
	@GeneratedValue
	private int idOperation;

	//bi-directional many-to-one association to Commande
    @ManyToOne
	@JoinColumn(name="NUMERO_COMMANDE")
	private Commande commande;

	//bi-directional many-to-one association to Prestation
    @ManyToOne
	@JoinColumn(name="CODE_PRESTATION")
	private Prestation prestation;
    
	//bi-directional many-to-one association to Collaborateur
    @ManyToOne
	@JoinColumn(name="MATRICULE_CHEF_ESCALE")
	private Collaborateur chefEscale;

	//bi-directional many-to-one association to Poste
    @ManyToOne
	@JoinColumn(name="CODE_POSTE")
	private Poste poste;

	//bi-directional many-to-one association to Main
	@OneToMany(cascade={CascadeType.PERSIST}, mappedBy="operation")
	private Set<Main> mains;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_DEBUT_OPERATION")
	private java.util.Date dateDebutOperation;

	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_FIN_OPERATION")
	private java.util.Date dateFinOperation;

	@Column(name="HEURE_DEBUT_OPERATION")
	private String heureDebutOperation;

	@Column(name="HEURE_FIN_OPERATION")
	private String heureFinOperation;

	@Column(name="SHIFT_OPERATION")
	private int shiftOperation;
	
	@Column(name="NUM_COMMANDE_EXTERNE")
	private String numeroCommandeExterne;
	
	// DEBUT_V0R0_E0005_KRIMOU_20/04/2013 
	@Column(name="MEMO")
	private String memo;
	// FIN_V0R0_E0005_KRIMOU_20/04/2013 

    public Operation() {
    }

	public Operation(Commande commande, Prestation prestation,
			Collaborateur chefEscale, Poste poste) {
		super();
		this.commande = commande;
		this.prestation = prestation;
		this.chefEscale = chefEscale;
		this.poste = poste;
	}

	public Operation(Commande commande, Prestation prestation,
			Collaborateur chefEscale, Poste poste, Date dateDebutOperation,
			Date dateFinOperation, String heureDebutOperation,
			String heureFinOperation, int shiftOperation) {
		super();
		this.commande = commande;
		this.prestation = prestation;
		this.chefEscale = chefEscale;
		this.poste = poste;
		this.dateDebutOperation = dateDebutOperation;
		this.dateFinOperation = dateFinOperation;
		this.heureDebutOperation = heureDebutOperation;
		this.heureFinOperation = heureFinOperation;
		this.shiftOperation = shiftOperation;
	}

	public int getIdOperation() {
		return this.idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}

	public java.util.Date getDateDebutOperation() {
		return this.dateDebutOperation;
	}

	public void setDateDebutOperation(java.util.Date dateDebutOperation) {
		this.dateDebutOperation = dateDebutOperation;
	}

	public java.util.Date getDateFinOperation() {
		return this.dateFinOperation;
	}

	public void setDateFinOperation(java.util.Date dateFinOperation) {
		this.dateFinOperation = dateFinOperation;
	}

	public String getHeureDebutOperation() {
		return this.heureDebutOperation;
	}

	public void setHeureDebutOperation(String heureDebutOperation) {
		this.heureDebutOperation = heureDebutOperation;
	}

	public String getHeureFinOperation() {
		return this.heureFinOperation;
	}

	public void setHeureFinOperation(String heureFinOperation) {
		this.heureFinOperation = heureFinOperation;
	}

	public int getShiftOperation() {
		return this.shiftOperation;
	}

	public void setShiftOperation(int shiftOperation) {
		this.shiftOperation = shiftOperation;
	}

	public Set<Main> getMains() {
		return this.mains;
	}

	public void setMains(Set<Main> mains) {
		this.mains = mains;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	public Collaborateur getChefEscale() {
		return chefEscale;
	}

	public void setChefEscale(Collaborateur chefEscale) {
		this.chefEscale = chefEscale;
	}

	public Poste getPoste() {
		return poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	public String getNumeroCommandeExterne() {
		return numeroCommandeExterne;
	}

	public void setNumeroCommandeExterne(String numeroCommandeExterne) {
		this.numeroCommandeExterne = numeroCommandeExterne;
	}

	// DEBUT_V0R0_E0005_KRIMOU_20/04/2013 
	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}
	// FIN_V0R0_E0005_KRIMOU_20/04/2013 

	
}