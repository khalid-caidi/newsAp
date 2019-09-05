package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the COMMANDE_MARCHANDISE database table.
 * 
 */
@Embeddable
public class CommandeMarchandisePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;



	//bi-directional many-to-one association to Commande
    @ManyToOne
	@JoinColumn(name="NUMERO_COMMANDE")
	private Commande commande;

	//bi-directional many-to-one association to Commande
    @ManyToOne
	@JoinColumn(name="CODE_MARCHANDISE")
	private Marchandise marchandise;

    
    
	public CommandeMarchandisePK(Commande commande, Marchandise marchandise) {
		super();
		this.commande = commande;
		this.marchandise = marchandise;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Marchandise getMarchandise() {
		return marchandise;
	}

	public void setMarchandise(Marchandise marchandise) {
		this.marchandise = marchandise;
	}

    public CommandeMarchandisePK() {
    }
	
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof CommandeMarchandisePK)) {
			return false;
		}
		CommandeMarchandisePK castOther = (CommandeMarchandisePK)other;
		return 
			this.marchandise.getCodeMarchandise().equals(castOther.marchandise.getCodeMarchandise())
			&& this.commande.getNumeroCommande().equals(castOther.commande.getNumeroCommande());

    }
    
	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.marchandise.getCodeMarchandise().hashCode();
		hash = hash * prime + this.commande.getNumeroCommande().hashCode();
		
		return hash;
    }
}