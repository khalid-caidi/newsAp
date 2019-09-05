package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COMMANDE_MARCHANDISE database table.
 * 
 */
@Entity
@Table(name="COMMANDE_MARCHANDISE")
public class CommandeMarchandise implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CommandeMarchandisePK id;

	@Column(name="QUANTITE")
	private BigDecimal quantite;
	
    public CommandeMarchandise() {
    }

	public CommandeMarchandise(CommandeMarchandisePK id, BigDecimal quantite) {
		super();
		this.id = id;
		this.quantite = quantite;
	}

	public CommandeMarchandisePK getId() {
		return this.id;
	}

	public void setId(CommandeMarchandisePK id) {
		this.id = id;
	}
	
	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	
}