package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Main_MARCHANDISE database table.
 * 
 */
@Embeddable
public class MainMarchandisePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;



	//bi-directional many-to-one association to Main
    @ManyToOne
	@JoinColumn(name="ID_MAIN")
	private Main main;

	//bi-directional many-to-one association to Main
    @ManyToOne
	@JoinColumn(name="CODE_MARCHANDISE")
	private Marchandise marchandise;

    
    
	public MainMarchandisePK(Main main, Marchandise marchandise) {
		super();
		this.main = main;
		this.marchandise = marchandise;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Marchandise getMarchandise() {
		return marchandise;
	}

	public void setMarchandise(Marchandise marchandise) {
		this.marchandise = marchandise;
	}

    public MainMarchandisePK() {
    }
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MainMarchandisePK)) {
			return false;
		}
		MainMarchandisePK castOther = (MainMarchandisePK)other;
		return 
			this.marchandise.getCodeMarchandise().equals(castOther.marchandise.getCodeMarchandise())
			&& new Integer(this.main.getIdMain()).equals(new Integer(castOther.main.getIdMain()));

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.marchandise.getCodeMarchandise().hashCode();
		hash = hash * prime + new Integer(this.main.getIdMain()).hashCode();
		
		return hash;
    }
}