package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the ARRET database table.
 * 
 */
@Entity
@Table(name="ARRET")
public class Arret implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_ARRET")
	private String codeArret;

	@Column(name="MOTIF_ARRET")
	private String motifArret;

	//bi-directional many-to-one association to MainArret
	@OneToMany(mappedBy="id.arret")
	private Set<MainArret> mainArrets;

    public Arret() {
    }

	public String getCodeArret() {
		return this.codeArret;
	}

	public void setCodeArret(String codeArret) {
		this.codeArret = codeArret;
	}

	public String getMotifArret() {
		return this.motifArret;
	}

	public void setMotifArret(String motifArret) {
		this.motifArret = motifArret;
	}

	public Set<MainArret> getMainArrets() {
		return this.mainArrets;
	}

	public void setMainArrets(Set<MainArret> mainArrets) {
		this.mainArrets = mainArrets;
	}
	
}