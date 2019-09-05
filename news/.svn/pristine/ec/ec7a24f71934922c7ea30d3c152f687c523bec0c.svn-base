package ma.marsamaroc.entite;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class MainAccessoirePK  implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	//bi-directional many-to-one association to Main
    @ManyToOne
	@JoinColumn(name="ID_MAIN")
	private Main main;	//bi-directional many-to-one association to Main
    
    @ManyToOne
	@JoinColumn(name="CODE_ACCESSOIRE")
	private Accessoire accessoire;

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Accessoire getAccessoire() {
		return accessoire;
	}

	public void setAccessoire(Accessoire accessoire) {
		this.accessoire = accessoire;
	}
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MainAccessoirePK)) {
			return false;
		}
		MainAccessoirePK castOther = (MainAccessoirePK)other;
		return 
			this.accessoire.getCodeAccessoire().equals(castOther.accessoire.getCodeAccessoire())
			&& new Integer(this.main.getIdMain()).equals(new Integer(castOther.main.getIdMain()));

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.accessoire.getCodeAccessoire().hashCode();
		hash = hash * prime + new Integer(this.main.getIdMain()).hashCode();
		
		return hash;
    }

}
