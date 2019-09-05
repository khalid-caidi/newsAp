package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the MAIN_ARRET database table.
 * 
 */
@Entity
@Table(name="MAIN_ARRET")
public class MainArret implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainArretPK id;
	
    @Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_FIN_ARRET")
	private java.util.Date dateFinArret;

	@Column(name="DESCRIPTION_ARRET")
	private String descriptionArret;

	@Column(name="HEURE_FIN_ARRET")
	private String heureFinArret;

    public MainArret() {
    }

	public MainArret(MainArretPK id, java.util.Date dateFinArret,
			String descriptionArret, String heureFinArret) {
		super();
		this.id = id;
		this.dateFinArret = dateFinArret;
		this.descriptionArret = descriptionArret;
		this.heureFinArret = heureFinArret;
	}

	public MainArretPK getId() {
		return this.id;
	}

	public void setId(MainArretPK id) {
		this.id = id;
	}
	
	public java.util.Date getDateFinArret() {
		return this.dateFinArret;
	}

	public void setDateFinArret(java.util.Date dateFinArret) {
		this.dateFinArret = dateFinArret;
	}

	public String getDescriptionArret() {
		return this.descriptionArret;
	}

	public void setDescriptionArret(String descriptionArret) {
		this.descriptionArret = descriptionArret;
	}

	public String getHeureFinArret() {
		return this.heureFinArret;
	}

	public void setHeureFinArret(String heureFinArret) {
		this.heureFinArret = heureFinArret;
	}
	
}