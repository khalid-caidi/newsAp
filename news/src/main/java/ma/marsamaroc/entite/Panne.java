package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the PANNE database table.
 * 
 */
@Entity
@Table(name="PANNE")
public class Panne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_PANNE")
	private String codePanne;

	@Column(name="MOTIF_PANNE")
	private String motifPanne;

	//bi-directional many-to-one association to MainPanneEquipement
	@OneToMany(mappedBy="id.panne")
	private Set<MainPanneEquipement> mainPanneEquipements;

    public Panne() {
    }

	public String getCodePanne() {
		return this.codePanne;
	}

	public void setCodePanne(String codePanne) {
		this.codePanne = codePanne;
	}

	public String getMotifPanne() {
		return this.motifPanne;
	}

	public void setMotifPanne(String motifPanne) {
		this.motifPanne = motifPanne;
	}

	public Set<MainPanneEquipement> getMainPanneEquipements() {
		return this.mainPanneEquipements;
	}

	public void setMainPanneEquipements(Set<MainPanneEquipement> mainPanneEquipements) {
		this.mainPanneEquipements = mainPanneEquipements;
	}
	
}