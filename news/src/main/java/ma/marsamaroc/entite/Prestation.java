package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the PRESTATION database table.
 * 
 */
@Entity
@Table(name="PRESTATION")
public class Prestation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_PRESTATION")
	private String codePrestation;

	@Column(name="LIBELLE_PRESTATION")
	private String libellePrestation;

	//bi-directional many-to-many association to Equipe
	@ManyToMany(mappedBy="prestations")
	private Set<Equipe> equipes;

	//bi-directional many-to-many association to Equipement
	@ManyToMany(mappedBy="prestations")
	private Set<Equipement> equipements;

	//bi-directional many-to-many association to Fonction
	@ManyToMany(mappedBy="prestations")
	private Set<Fonction> fonctions;

	//bi-directional many-to-one association to Typeprestation
    @ManyToOne
	@JoinColumn(name="CODE_TYPEPRESTATION")
	private Typeprestation typeprestation;

    public Prestation() {
    }

	public String getCodePrestation() {
		return this.codePrestation;
	}

	public void setCodePrestation(String codePrestation) {
		this.codePrestation = codePrestation;
	}

	public String getLibellePrestation() {
		return this.libellePrestation;
	}

	public void setLibellePrestation(String libellePrestation) {
		this.libellePrestation = libellePrestation;
	}

	public Set<Equipe> getEquipes() {
		return this.equipes;
	}

	public void setEquipes(Set<Equipe> equipes) {
		this.equipes = equipes;
	}
	
	public Set<Equipement> getEquipements() {
		return this.equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}
	
	public Set<Fonction> getFonctions() {
		return this.fonctions;
	}

	public void setFonctions(Set<Fonction> fonctions) {
		this.fonctions = fonctions;
	}
	
	public Typeprestation getTypeprestation() {
		return this.typeprestation;
	}

	public void setTypeprestation(Typeprestation typeprestation) {
		this.typeprestation = typeprestation;
	}
	
}