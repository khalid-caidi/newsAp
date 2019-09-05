package ma.marsamaroc.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


/**
 * The persistent class for the MAIN_COLLABORATEUR database table.
 * 
 */
@Entity
@Table(name="MAIN_COLLABORATEUR")
public class MainCollaborateur implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId 
	private MainCollaborateurPK id;
	
	//bi-directional many-to-one association to Arret
    @ManyToOne
	@JoinColumn(name="CODE_FONCTION_AFFECTATION")
	private Fonction fonctionAffectation;
	
	@Column(name="TERRE")
	private int terre;

	@Column(name="VACATION")
	private int vacation;

	public MainCollaborateur() {
		super();
	}

	public MainCollaborateur(MainCollaborateurPK id,
			Fonction fonctionAffectation, int terre, int vacation) {
		super();
		this.id = id;
		this.fonctionAffectation = fonctionAffectation;
		this.terre = terre;
		this.vacation = vacation;
	}

	public MainCollaborateurPK getId() {
		return id;
	}

	public void setId(MainCollaborateurPK id) {
		this.id = id;
	}

	public Fonction getFonctionAffectation() {
		return fonctionAffectation;
	}

	public void setFonctionAffectation(Fonction fonctionAffectation) {
		this.fonctionAffectation = fonctionAffectation;
	}

	public int getTerre() {
		return terre;
	}

	public void setTerre(int terre) {
		this.terre = terre;
	}

	public int getVacation() {
		return vacation;
	}

	public void setVacation(int vacation) {
		this.vacation = vacation;
	}

}
