package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;


/**
 * The persistent class for the ORGANISATIONTRAVAIL database table.
 * 
 */
@Entity
@Table(name="ORGANISATIONTRAVAIL")
public class Organisationtravail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_ORGANISATIONTRAVAIL")
	private int idOrganisationtravail;

	@Column(name="DATEEFFET")
	private Timestamp dateeffet;

	@Column(name="DATEFIN")
	private Timestamp datefin;

	@Column(name="ETAT")
	private String etat;

	@Column(name="LIBELLE_ORGANISATIONTRAVAIL")
	private String libelleOrganisationtravail;

	@Column(name="NBRSHIFTDIM")
	private int nbrshiftdim;

	@Column(name="NBRSHIFTJEU")
	private int nbrshiftjeu;

	@Column(name="NBRSHIFTLUN")
	private int nbrshiftlun;

	@Column(name="NBRSHIFTMAR")
	private int nbrshiftmar;

	@Column(name="NBRSHIFTMER")
	private int nbrshiftmer;

	@Column(name="NBRSHIFTSAM")
	private int nbrshiftsam;

	@Column(name="NBRSHIFTVEND")
	private int nbrshiftvend;

	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	//bi-directional many-to-one association to Planroulement
	@OneToMany(mappedBy="organisationtravail")
	private Set<Planroulement> planroulements;

	//bi-directional many-to-one association to Shift
	@OneToMany(mappedBy="organisationtravail")
	private Set<Shift> shifts;

    public Organisationtravail() {
    }

	public int getIdOrganisationtravail() {
		return this.idOrganisationtravail;
	}

	public void setIdOrganisationtravail(int idOrganisationtravail) {
		this.idOrganisationtravail = idOrganisationtravail;
	}

	public Timestamp getDateeffet() {
		return this.dateeffet;
	}

	public void setDateeffet(Timestamp dateeffet) {
		this.dateeffet = dateeffet;
	}

	public Timestamp getDatefin() {
		return this.datefin;
	}

	public void setDatefin(Timestamp datefin) {
		this.datefin = datefin;
	}

	public String getEtat() {
		return this.etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getLibelleOrganisationtravail() {
		return this.libelleOrganisationtravail;
	}

	public void setLibelleOrganisationtravail(String libelleOrganisationtravail) {
		this.libelleOrganisationtravail = libelleOrganisationtravail;
	}

	public int getNbrshiftdim() {
		return this.nbrshiftdim;
	}

	public void setNbrshiftdim(int nbrshiftdim) {
		this.nbrshiftdim = nbrshiftdim;
	}

	public int getNbrshiftjeu() {
		return this.nbrshiftjeu;
	}

	public void setNbrshiftjeu(int nbrshiftjeu) {
		this.nbrshiftjeu = nbrshiftjeu;
	}

	public int getNbrshiftlun() {
		return this.nbrshiftlun;
	}

	public void setNbrshiftlun(int nbrshiftlun) {
		this.nbrshiftlun = nbrshiftlun;
	}

	public int getNbrshiftmar() {
		return this.nbrshiftmar;
	}

	public void setNbrshiftmar(int nbrshiftmar) {
		this.nbrshiftmar = nbrshiftmar;
	}

	public int getNbrshiftmer() {
		return this.nbrshiftmer;
	}

	public void setNbrshiftmer(int nbrshiftmer) {
		this.nbrshiftmer = nbrshiftmer;
	}

	public int getNbrshiftsam() {
		return this.nbrshiftsam;
	}

	public void setNbrshiftsam(int nbrshiftsam) {
		this.nbrshiftsam = nbrshiftsam;
	}

	public int getNbrshiftvend() {
		return this.nbrshiftvend;
	}

	public void setNbrshiftvend(int nbrshiftvend) {
		this.nbrshiftvend = nbrshiftvend;
	}

	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
	public Set<Planroulement> getPlanroulements() {
		return this.planroulements;
	}

	public void setPlanroulements(Set<Planroulement> planroulements) {
		this.planroulements = planroulements;
	}
	
	public Set<Shift> getShifts() {
		return this.shifts;
	}

	public void setShifts(Set<Shift> shifts) {
		this.shifts = shifts;
	}
	
}