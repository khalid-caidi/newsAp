package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the FONCTION database table.
 * 
 */
@Entity
@Table(name="FONCTION")
public class Fonction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_FONCTION")
	private String codeFonction;

	@Column(name="LIBELLE_FONCTION")
	private String libelleFonction;

	//bi-directional many-to-one association to Collaborateur
	@OneToMany(mappedBy="fonction")
	private Set<Collaborateur> collaborateurs;

	//bi-directional many-to-many association to Prestation
    @ManyToMany
	@JoinTable(
		name="FONCTION_PRESTATION"
		, joinColumns={
			@JoinColumn(name="CODE_FONCTION")
			}
		, inverseJoinColumns={
			@JoinColumn(name="CODE_PRESTATION")
			}
		)
	private Set<Prestation> prestations;

    public Fonction() {
    }

    public Fonction(String codeFonction, String libelleFonction) {
    	this.codeFonction = codeFonction;
    	this.libelleFonction = libelleFonction;
    }

	public String getCodeFonction() {
		return this.codeFonction;
	}

	public void setCodeFonction(String codeFonction) {
		this.codeFonction = codeFonction;
	}

	public String getLibelleFonction() {
		return this.libelleFonction;
	}

	public void setLibelleFonction(String libelleFonction) {
		this.libelleFonction = libelleFonction;
	}

	public Set<Collaborateur> getCollaborateurs() {
		return this.collaborateurs;
	}

	public void setCollaborateurs(Set<Collaborateur> collaborateurs) {
		this.collaborateurs = collaborateurs;
	}
	
	public Set<Prestation> getPrestations() {
		return this.prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	
}