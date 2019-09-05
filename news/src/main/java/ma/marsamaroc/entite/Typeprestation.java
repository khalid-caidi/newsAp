package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the TYPEPRESTATION database table.
 * 
 */
@Entity
@Table(name="TYPEPRESTATION")
public class Typeprestation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_TYPEPRESTATION")
	private String codeTypeprestation;

	@Column(name="LIBELLE_TYPEPRESTATION")
	private String libelleTypeprestation;

	//bi-directional many-to-one association to Planroulement
	@OneToMany(mappedBy="typeprestation")
	private Set<Planroulement> planroulements;

	//bi-directional many-to-one association to Prestation
	@OneToMany(mappedBy="typeprestation")
	private Set<Prestation> prestations;

    public Typeprestation() {
    }

	public String getCodeTypeprestation() {
		return this.codeTypeprestation;
	}

	public void setCodeTypeprestation(String codeTypeprestation) {
		this.codeTypeprestation = codeTypeprestation;
	}

	public String getLibelleTypeprestation() {
		return this.libelleTypeprestation;
	}

	public void setLibelleTypeprestation(String libelleTypeprestation) {
		this.libelleTypeprestation = libelleTypeprestation;
	}

	public Set<Planroulement> getPlanroulements() {
		return this.planroulements;
	}

	public void setPlanroulements(Set<Planroulement> planroulements) {
		this.planroulements = planroulements;
	}
	
	public Set<Prestation> getPrestations() {
		return this.prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	
}