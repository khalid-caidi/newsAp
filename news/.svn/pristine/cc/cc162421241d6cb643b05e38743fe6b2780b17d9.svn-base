package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the FAMILLE_EQUIPEMENT database table.
 * 
 */
@Entity
@Table(name="FAMILLE_EQUIPEMENT")
public class FamilleEquipement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_FAMILLEEQUIPEMENT")
	private String codeFamilleequipement;

	@Column(name="LIBELLE_FAMILLEEQUIPEMENT")
	private String libelleFamilleequipement;

	//bi-directional many-to-one association to Equipement
	@OneToMany(mappedBy="familleEquipement")
	private Set<Equipement> equipements;

	//bi-directional many-to-one association to FamilleEquipement
    @ManyToOne
	@JoinColumn(name="CODE_FAMILLEEQUIPEMENT_MERE")
	private FamilleEquipement familleEquipementMere;

	//bi-directional many-to-one association to FamilleEquipement
	@OneToMany(mappedBy="familleEquipementMere")
	private Set<FamilleEquipement> sousFamillesEquipements;

    public FamilleEquipement() {
    }

	public String getCodeFamilleequipement() {
		return this.codeFamilleequipement;
	}

	public void setCodeFamilleequipement(String codeFamilleequipement) {
		this.codeFamilleequipement = codeFamilleequipement;
	}

	public String getLibelleFamilleequipement() {
		return this.libelleFamilleequipement;
	}

	public void setLibelleFamilleequipement(String libelleFamilleequipement) {
		this.libelleFamilleequipement = libelleFamilleequipement;
	}

	public Set<Equipement> getEquipements() {
		return this.equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}
	
	public FamilleEquipement getFamilleEquipementMere() {
		return familleEquipementMere;
	}

	public void setFamilleEquipementMere(FamilleEquipement familleEquipementMere) {
		this.familleEquipementMere = familleEquipementMere;
	}

	public Set<FamilleEquipement> getSousFamillesEquipements() {
		return sousFamillesEquipements;
	}

	public void setSousFamillesEquipements(Set<FamilleEquipement> sousFamillesEquipements) {
		this.sousFamillesEquipements = sousFamillesEquipements;
	}
	
}