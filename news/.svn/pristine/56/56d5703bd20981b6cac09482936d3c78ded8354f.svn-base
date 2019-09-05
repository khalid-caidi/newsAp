package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Set;


/**
 * The persistent class for the ACCESSOIRE database table.
 * 
 */
@Entity
@Table(name="ACCESSOIRE")
public class Accessoire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_ACCESSOIRE")
	private String codeAccessoire;

	@Column(name="LIBELLE_ACCESSOIRE")
	private String libelleAccessoire;

	// DEBUT_V0R0_M0007_KRIMOU_20/04/2013
	/*//bi-directional many-to-many association to Main
	@ManyToMany(mappedBy="accessoires")
	private Set<Main> mains;*/
	 //bi-directional many-to-one association to CommandeMarchandise
  	@OneToMany(mappedBy="id.accessoire")
  	private Set<MainAccessoire> mainAccessoires;
	// FIN_V0R0_M0007_KRIMOU_20/04/2013
	
	//bi-directional many-to-one association to Terminal
    @ManyToOne
	@JoinColumn(name="CODE_TERMINAL")
	private Terminal terminal;

    public Accessoire() {
    }

	public Accessoire(String codeAccessoire, String libelleAccessoire) {
		super();
		this.codeAccessoire = codeAccessoire;
		this.libelleAccessoire = libelleAccessoire;
	}

	public String getCodeAccessoire() {
		return this.codeAccessoire;
	}

	public void setCodeAccessoire(String codeAccessoire) {
		this.codeAccessoire = codeAccessoire;
	}

	public String getLibelleAccessoire() {
		return this.libelleAccessoire;
	}

	public void setLibelleAccessoire(String libelleAccessoire) {
		this.libelleAccessoire = libelleAccessoire;
	}

	// DEBUT_V0R0_M0007_KRIMOU_20/04/2013
	/*public Set<Main> getMains() {
		return this.mains;
	}

	public void setMains(Set<Main> mains) {
		this.mains = mains;
	}*/

	public Set<MainAccessoire> getMainAccessoires() {
		return mainAccessoires;
	}

	public void setMainAccessoires(Set<MainAccessoire> mainAccessoires) {
		this.mainAccessoires = mainAccessoires;
	}
	// FIN_V0R0_M0007_KRIMOU_20/04/2013

	public Terminal getTerminal() {
		return terminal;
	}

	public void setTerminal(Terminal terminal) {
		this.terminal = terminal;
	}
	
}