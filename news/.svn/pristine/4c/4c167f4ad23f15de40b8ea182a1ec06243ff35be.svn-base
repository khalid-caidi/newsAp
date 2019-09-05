package ma.marsamaroc.entite;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * The primary key class for the MAIN_ARRET database table.
 * 
 */
@Embeddable
public class MainArretPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Arret
    @ManyToOne
	@JoinColumn(name="CODE_ARRET")
	private Arret arret;

	//bi-directional many-to-one association to Main
    @ManyToOne
	@JoinColumn(name="ID_MAIN")
	private Main main;

    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_DEBUT_ARRET")
	private java.util.Date dateDebutArret;

	@Column(name="HEURE_DEBUT_ARRET")
	private String heureDebutArret;

    public MainArretPK() {
    }

	public MainArretPK(Arret arret, Main main, Date dateDebutArret,
			String heureDebutArret) {
		super();
		this.arret = arret;
		this.main = main;
		this.dateDebutArret = dateDebutArret;
		this.heureDebutArret = heureDebutArret;
	}

	public Arret getArret() {
		return this.arret;
	}

	public void setArret(Arret arret) {
		this.arret = arret;
	}
	
	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}
	public java.util.Date getDateDebutArret() {
		return this.dateDebutArret;
	}
	public void setDateDebutArret(java.util.Date dateDebutArret) {
		this.dateDebutArret = dateDebutArret;
	}
	public String getHeureDebutArret() {
		return this.heureDebutArret;
	}
	public void setHeureDebutArret(String heureDebutArret) {
		this.heureDebutArret = heureDebutArret;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MainArretPK)) {
			return false;
		}
		MainArretPK castOther = (MainArretPK)other;
		return 
			this.arret.getCodeArret().equals(castOther.arret.getCodeArret())
			&& (this.main.getIdMain() == castOther.main.getIdMain())
			&& this.dateDebutArret.equals(castOther.dateDebutArret)
			&& this.heureDebutArret.equals(castOther.heureDebutArret);

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.arret.getCodeArret().hashCode();
		hash = hash * prime + this.main.getIdMain();
		hash = hash * prime + this.dateDebutArret.hashCode();
		hash = hash * prime + this.heureDebutArret.hashCode();
		
		return hash;
    }
}