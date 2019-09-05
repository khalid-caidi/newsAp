package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the EQUIPE database table.
 * 
 */
@Entity
@Table(name="EQUIPE")
public class Equipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_EQUIPE")
	private String code;
	
	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;


	@Column(name="LIBELLE_EQUIPE")
	private String libelle;
	
	//bi-directional many-to-one association to Collaborateur
    @ManyToOne
	@JoinColumn(name="MATRICULE_RESPONSABLE")
	private Collaborateur responsable;

	//bi-directional many-to-many association to Collaborateur
    @ManyToMany
	@JoinTable(
		name="EQUIPE_MEMBRE"
		, joinColumns={
			@JoinColumn(name="CODE_EQUIPE")
			}
		, inverseJoinColumns={
			@JoinColumn(name="MATRICULE_COLLABORATEUR")
			}
		)
	private Set<Collaborateur> membres;

	//bi-directional many-to-one association to Operation
    @ManyToMany
	@JoinTable(
			name="EQUIPE_PRESTATION"
			, joinColumns={
				@JoinColumn(name="CODE_EQUIPE")
				}
			, inverseJoinColumns={
				@JoinColumn(name="CODE_PRESTATION")
				}
			)
	private Set<Prestation> prestations;

	//bi-directional many-to-one association to DETAILPLANROULEMENT
	@OneToMany(mappedBy="equipe")
	private Set<Detailplanroulement> detailplanroulements;
    
    public Equipe() {
    }
    public Equipe(String code, String libelle, Terminal terminal,
			Collaborateur responsable, Set<Collaborateur> membres,
			Set<Prestation> prestations) {
		super();
		this.code = code;
		this.libelle = libelle;
		this.responsable = responsable;
		this.membres = membres;
		this.prestations = prestations;
	}
	public Equipe (Collaborateur responsable)
	{
		this.responsable = responsable;
	}
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collaborateur getResponsable() {
		return this.responsable;
	}

	public void setResponsable(Collaborateur responsable) {
		this.responsable = responsable;
	}
	
	public Set<Collaborateur> getMembres() {
		return this.membres;
	}

	public void setMembres(Set<Collaborateur> membres) {
		this.membres = membres;
	}

	public Set<Detailplanroulement> getDetailplanroulements() {
		return detailplanroulements;
	}

	public void setDetailplanroulements(Set<Detailplanroulement> detailplanroulements) {
		this.detailplanroulements = detailplanroulements;
	}

	public Set<Prestation> getPrestations() {
		return prestations;
	}

	public void setPrestations(Set<Prestation> prestations) {
		this.prestations = prestations;
	}
	public Terminal getTerminal() {
		return terminal;
	}
	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
}