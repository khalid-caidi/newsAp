package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the GROUPEPOSTES database table.
 * 
 */
@Entity
@Table(name="GROUPEPOSTES")
public class Groupeposte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_GROUPEPOSTES")
	private String codeGroupepostes;

	@Column(name="LIBELLE_GROUPEPOSTE")
	private String libelleGroupeposte;

	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

	//bi-directional many-to-one association to Poste
	@OneToMany(mappedBy="groupepostes")
	private Set<Poste> postes;

	//bi-directional many-to-many association to Equipement
	@ManyToMany(mappedBy="groupepostes")
	private Set<Equipement> equipements;

    public Groupeposte() {
    }

	public String getCodeGroupepostes() {
		return this.codeGroupepostes;
	}

	public void setCodeGroupepostes(String codeGroupepostes) {
		this.codeGroupepostes = codeGroupepostes;
	}

	public String getLibelleGroupeposte() {
		return this.libelleGroupeposte;
	}

	public void setLibelleGroupeposte(String libelleGroupeposte) {
		this.libelleGroupeposte = libelleGroupeposte;
	}

	public Terminal getTerminal() {
		return this.terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
	public Set<Poste> getPostes() {
		return this.postes;
	}

	public void setPostes(Set<Poste> postes) {
		this.postes = postes;
	}
	
	public Set<Equipement> getEquipements() {
		return this.equipements;
	}

	public void setEquipements(Set<Equipement> equipements) {
		this.equipements = equipements;
	}
	
}