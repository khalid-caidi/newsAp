package ma.marsamaroc.entite;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


/**
 * The persistent class for the MARCHANDISE database table.
 * 
 */
@Entity
@Table(name="MARCHANDISE")
public class Marchandise implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_MARCHANDISE")
	private String codeMarchandise;

	@Column(name="LIBELLE_MARCHANDISE")
	private String libelleMarchandise;

	//bi-directional many-to-one association to Typemarchandise
    @ManyToOne
	@JoinColumn(name="CODE_TYPEMARCHANDISE")
	private Typemarchandise typemarchandise;
    
    //bi-directional many-to-one association to CommandeMarchandise
  	@OneToMany(mappedBy="id.marchandise")
  	private Set<MainMarchandise> mainMarchandise;
  	
    public Marchandise() {
    }

	public Marchandise(String codeMarchandise, String libelleMarchandise) {
		super();
		this.codeMarchandise = codeMarchandise;
		this.libelleMarchandise = libelleMarchandise;
	}

	public String getCodeMarchandise() {
		return this.codeMarchandise;
	}

	public void setCodeMarchandise(String codeMarchandise) {
		this.codeMarchandise = codeMarchandise;
	}

	public String getLibelleMarchandise() {
		return this.libelleMarchandise;
	}

	public void setLibelleMarchandise(String libelleMarchandise) {
		this.libelleMarchandise = libelleMarchandise;
	}

	public Typemarchandise getTypemarchandise() {
		return this.typemarchandise;
	}

	public void setTypemarchandise(Typemarchandise typemarchandise) {
		this.typemarchandise = typemarchandise;
	}

	public Set<MainMarchandise> getMainMarchandise() {
		return mainMarchandise;
	}

	public void setMainMarchandise(Set<MainMarchandise> mainMarchandise) {
		this.mainMarchandise = mainMarchandise;
	}
	
}