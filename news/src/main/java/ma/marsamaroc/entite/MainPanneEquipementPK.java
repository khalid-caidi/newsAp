package ma.marsamaroc.entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The primary key class for the MAIN_PANNE_EQUIPEMENT database table.
 * 
 */
@Embeddable
public class MainPanneEquipementPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Equipement
    @ManyToOne
	@JoinColumn(name="CODE_EQUIPEMENT")
	private Equipement equipement;

	//bi-directional many-to-one association to Main
    @ManyToOne
	@JoinColumn(name="ID_MAIN")
	private Main main;

	//bi-directional many-to-one association to Panne
    @ManyToOne
	@JoinColumn(name="CODE_PANNE")
	private Panne panne;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_DEBUT_PANNE")
	private java.util.Date dateDebutPanne;

	@Column(name="HEURE_DEBUT_PANNE")
	private String heureDebutPanne;

    public MainPanneEquipementPK() {
    }

	public MainPanneEquipementPK(Equipement equipement, Main main, Panne panne,
			Date dateDebutPanne, String heureDebutPanne) {
		super();
		this.equipement = equipement;
		this.main = main;
		this.panne = panne;
		this.dateDebutPanne = dateDebutPanne;
		this.heureDebutPanne = heureDebutPanne;
	}

	public Equipement getEquipement() {
		return this.equipement;
	}

	public void setEquipement(Equipement equipement) {
		this.equipement = equipement;
	}
	
	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	
	public Panne getPanne() {
		return this.panne;
	}

	public void setPanne(Panne panne) {
		this.panne = panne;
	}
	

	public java.util.Date getDateDebutPanne() {
		return this.dateDebutPanne;
	}
	public void setDateDebutPanne(java.util.Date dateDebutPanne) {
		this.dateDebutPanne = dateDebutPanne;
	}
	public String getHeureDebutPanne() {
		return this.heureDebutPanne;
	}
	public void setHeureDebutPanne(String heureDebutPanne) {
		this.heureDebutPanne = heureDebutPanne;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MainPanneEquipementPK)) {
			return false;
		}
		MainPanneEquipementPK castOther = (MainPanneEquipementPK)other;
		return 
			this.panne.getCodePanne().equals(castOther.panne.getCodePanne())
			&& (this.main.getIdMain() == castOther.main.getIdMain())
			&& this.equipement.getCodeEquipement().equals(castOther.equipement.getCodeEquipement())
			&& this.dateDebutPanne.equals(castOther.dateDebutPanne)
			&& this.heureDebutPanne.equals(castOther.heureDebutPanne);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.panne.getCodePanne().hashCode();
		hash = hash * prime + this.main.getIdMain();
		hash = hash * prime + this.equipement.getCodeEquipement().hashCode();
		hash = hash * prime + this.dateDebutPanne.hashCode();
		hash = hash * prime + this.heureDebutPanne.hashCode();
		
		return hash;
    }
}