package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


/**
 * The persistent class for the COMMANDE database table.
 * 
 */
@Entity
@Table(name="COMMANDE")
public class Commande implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="NUMERO_COMMANDE")
	private String numeroCommande;

	@Column(name="DATE_COMMANDE")
	private Date dateCommande;

	@Column(name="DATE_DEBUT_TRAVAIL")
	private Date dateDebutTravail;

	@Column(name="DATE_FIN_TRAVAIL")
	private Date dateFinTravail;

	@Column(name="HEURE_COMMANDE")
	private String heureCommande;

	@Column(name="HEURE_DEBUT_TRAVAIL")
	private String heureDebutTravail;

	@Column(name="HEURE_FIN_TRAVAIL")
	private String heureFinTravail;

    @Column(name="NUMERO_ESCALE")
	private String numeroEscale;

	//bi-directional many-to-many association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	

	//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="commande")
	private Set<Operation> operations;

    public Commande() {
    }

	public String getNumeroCommande() {
		return this.numeroCommande;
	}

	public void setNumeroCommande(String numeroCommande) {
		this.numeroCommande = numeroCommande;
	}

	public Date getDateCommande() {
		return this.dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateDebutTravail() {
		return this.dateDebutTravail;
	}

	public void setDateDebutTravail(Date dateDebutTravail) {
		this.dateDebutTravail = dateDebutTravail;
	}

	public Date getDateFinTravail() {
		return this.dateFinTravail;
	}

	public void setDateFinTravail(Date dateFinTravail) {
		this.dateFinTravail = dateFinTravail;
	}

	public String getHeureCommande() {
		return this.heureCommande;
	}

	public void setHeureCommande(String heureCommande) {
		this.heureCommande = heureCommande;
	}

	public String getHeureDebutTravail() {
		return this.heureDebutTravail;
	}

	public void setHeureDebutTravail(String heureDebutTravail) {
		this.heureDebutTravail = heureDebutTravail;
	}

	public String getHeureFinTravail() {
		return this.heureFinTravail;
	}

	public void setHeureFinTravail(String heureFinTravail) {
		this.heureFinTravail = heureFinTravail;
	}
	
	public Set<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}

	public String getNumeroEscale() {
		return numeroEscale;
	}

	public void setNumeroEscale(String numeroEscale) {
		this.numeroEscale = numeroEscale;
	}
	
}