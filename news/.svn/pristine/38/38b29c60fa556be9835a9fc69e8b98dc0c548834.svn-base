package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SHIFT database table.
 * 
 */
@Entity
@Table(name="SHIFT")
public class Shift implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_SHIFT")
	private int idShift;

	@Column(name="HEURE_DEBUT_SHIFT")
	private String heureDebutShift;

	@Column(name="HEURE_FIN_SHIFT")
	private String heureFinShift;

	@Column(name="LIBELLE_SHIFT")
	private String libelleShift;

	@Column(name="ORDRE_SHIFT")
	private int ordreShift;

	//bi-directional many-to-one association to Organisationtravail
    @ManyToOne
	@JoinColumn(name="ID_ORGANISATIONTRAVAIL")
	private Organisationtravail organisationtravail;

    public Shift() {
    }

	public int getIdShift() {
		return this.idShift;
	}

	public void setIdShift(int idShift) {
		this.idShift = idShift;
	}

	public String getHeureDebutShift() {
		return this.heureDebutShift;
	}

	public void setHeureDebutShift(String heureDebutShift) {
		this.heureDebutShift = heureDebutShift;
	}

	public String getHeureFinShift() {
		return this.heureFinShift;
	}

	public void setHeureFinShift(String heureFinShift) {
		this.heureFinShift = heureFinShift;
	}

	public String getLibelleShift() {
		return this.libelleShift;
	}

	public void setLibelleShift(String libelleShift) {
		this.libelleShift = libelleShift;
	}

	public int getOrdreShift() {
		return this.ordreShift;
	}

	public void setOrdreShift(int ordreShift) {
		this.ordreShift = ordreShift;
	}

	public Organisationtravail getOrganisationtravail() {
		return this.organisationtravail;
	}

	public void setOrganisationtravail(Organisationtravail organisationtravail) {
		this.organisationtravail = organisationtravail;
	}
	
}