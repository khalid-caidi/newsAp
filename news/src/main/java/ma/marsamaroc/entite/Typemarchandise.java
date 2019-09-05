package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the TYPEMARCHANDISE database table.
 * 
 */
@Entity
@Table(name="TYPEMARCHANDISE")
public class Typemarchandise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_TYPEMARCHANDISE")
	private String codeTypemarchandise;

	@Column(name="LIBELLE_TYPEMARCHANDISE")
	private String libelleTypemarchandise;

	//bi-directional many-to-one association to Marchandise
	@OneToMany(mappedBy="typemarchandise")
	private Set<Marchandise> marchandises;

    public Typemarchandise() {
    }

	public String getCodeTypemarchandise() {
		return this.codeTypemarchandise;
	}

	public void setCodeTypemarchandise(String codeTypemarchandise) {
		this.codeTypemarchandise = codeTypemarchandise;
	}

	public String getLibelleTypemarchandise() {
		return this.libelleTypemarchandise;
	}

	public void setLibelleTypemarchandise(String libelleTypemarchandise) {
		this.libelleTypemarchandise = libelleTypemarchandise;
	}

	public Set<Marchandise> getMarchandises() {
		return this.marchandises;
	}

	public void setMarchandises(Set<Marchandise> marchandises) {
		this.marchandises = marchandises;
	}
	
}