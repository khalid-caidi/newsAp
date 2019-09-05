package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.sql.Timestamp;


/**
 * The persistent class for the MAIN_PANNE_EQUIPEMENT database table.
 * 
 */
@Entity
@Table(name="MAIN_PANNE_EQUIPEMENT")
public class MainPanneEquipement implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainPanneEquipementPK id;

	@Column(name="ARRET_EXPLOITATION")
	private int arretExploitation;
	
	@Temporal( TemporalType.TIMESTAMP)
	@Column(name="DATE_FIN_PANNE")
	private java.util.Date dateFinPanne;

	@Column(name="DESCRIPTION_PANNE")
	private String descriptionPanne;

	@Column(name="HEURE_FIN_PANNE")
	private String heureFinPanne;
	

	//bi-directional many-to-one association to Equipement
    @ManyToOne
	@JoinColumn(name="CODE_EQUIPEMENT_REMPLACEMENT")
	private Equipement equipementRemplacement;

    public MainPanneEquipement() {
    }

	public MainPanneEquipement(MainPanneEquipementPK id, int arretExploitation,
			java.util.Date dateFinPanne, String descriptionPanne,
			String heureFinPanne) {
		super();
		this.id = id;
		this.arretExploitation = arretExploitation;
		this.dateFinPanne = dateFinPanne;
		this.descriptionPanne = descriptionPanne;
		this.heureFinPanne = heureFinPanne;
	}

	public MainPanneEquipementPK getId() {
		return this.id;
	}

	public void setId(MainPanneEquipementPK id) {
		this.id = id;
	}
	
	public int getArretExploitation() {
		return this.arretExploitation;
	}

	public void setArretExploitation(int arretExploitation) {
		this.arretExploitation = arretExploitation;
	}
	
	public java.util.Date getDateFinPanne() {
		return this.dateFinPanne;
	}

	public void setDateFinPanne(java.util.Date dateFinPanne) {
		this.dateFinPanne = dateFinPanne;
	}

	public String getDescriptionPanne() {
		return this.descriptionPanne;
	}

	public void setDescriptionPanne(String descriptionPanne) {
		this.descriptionPanne = descriptionPanne;
	}

	public String getHeureFinPanne() {
		return this.heureFinPanne;
	}

	public void setHeureFinPanne(String heureFinPanne) {
		this.heureFinPanne = heureFinPanne;
	}

	public Equipement getEquipementRemplacement() {
		return equipementRemplacement;
	}

	public void setEquipementRemplacement(Equipement equipementRemplacement) {
		this.equipementRemplacement = equipementRemplacement;
	}
}