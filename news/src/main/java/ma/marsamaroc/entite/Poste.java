package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the POSTE database table.
 * 
 */
@Entity
@Table(name="POSTE")
public class Poste implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_POSTE")
	private String codePoste;

	@Column(name="LIBELLE_POSTE")
	private String libellePoste;

	//bi-directional many-to-one association to Groupeposte
    @ManyToOne
	@JoinColumn(name="CODE_GROUPEPOSTES")
	private Groupeposte groupepostes;

	//bi-directional many-to-one association to Operation
	@OneToMany(mappedBy="poste")
	private Set<Operation> operations;

    public Poste() {
    }

	public String getCodePoste() {
		return this.codePoste;
	}

	public void setCodePoste(String codePoste) {
		this.codePoste = codePoste;
	}

	public String getLibellePoste() {
		return this.libellePoste;
	}

	public void setLibellePoste(String libellePoste) {
		this.libellePoste = libellePoste;
	}

	public Groupeposte getGroupepostes() {
		return this.groupepostes;
	}

	public void setGroupepostes(Groupeposte groupepostes) {
		this.groupepostes = groupepostes;
	}
	
	public Set<Operation> getOperations() {
		return this.operations;
	}

	public void setOperations(Set<Operation> operations) {
		this.operations = operations;
	}
	
}