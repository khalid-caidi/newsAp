package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the PLANROULEMENT database table.
 * 
 */
@Entity
@Table(name="PLANROULEMENT")
public class Planroulement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id_PlanRoulement")
	private int id_PlanRoulement;

	private Timestamp dateDebut;

	private Timestamp dateFin;

	private String etat;

	private String libelle;

	private int nbreSemaine;

	//bi-directional many-to-one association to Organisationtravail
    @ManyToOne
	@JoinColumn(name="code_oranisationTravail")
	private Organisationtravail organisationtravail;

	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="code_terminal")
	private Terminal terminal;

	//bi-directional many-to-one association to Typeprestation
    @ManyToOne
	@JoinColumn(name="code_operation")
	private Typeprestation typeprestation;

    public Planroulement() {
    }

	public int getId_PlanRoulement() {
		return this.id_PlanRoulement;
	}

	public void setId_PlanRoulement(int id_PlanRoulement) {
		this.id_PlanRoulement = id_PlanRoulement;
	}

	public Timestamp getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Timestamp getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Timestamp dateFin) {
		this.dateFin = dateFin;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getNbreSemaine() {
		return this.nbreSemaine;
	}

	public void setNbreSemaine(int nbreSemaine) {
		this.nbreSemaine = nbreSemaine;
	}

	public Organisationtravail getOrganisationtravail() {
		return this.organisationtravail;
	}

	public void setOrganisationtravail(Organisationtravail organisationtravail) {
		this.organisationtravail = organisationtravail;
	}
	
	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
	public Typeprestation getTypeprestation() {
		return this.typeprestation;
	}

	public void setTypeprestation(Typeprestation typeprestation) {
		this.typeprestation = typeprestation;
	}
	
}