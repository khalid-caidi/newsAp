package ma.marsamaroc.entite;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The primary key class for the MAIN_COLLABORATEUR database table.
 * 
 */
@Embeddable
public class MainCollaborateurPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name="MATRICULE_COLLABORATEUR")
	private Collaborateur collaborateur;

	@ManyToOne
	@JoinColumn(name="ID_MAIN")
	private Main main;

	public MainCollaborateurPK() {
		super();
	}

	public MainCollaborateurPK(Collaborateur collaborateur, Main main) {
		super();
		this.collaborateur = collaborateur;
		this.main = main;
	}

	public Collaborateur getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(Collaborateur collaborateur) {
		this.collaborateur = collaborateur;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	

}
