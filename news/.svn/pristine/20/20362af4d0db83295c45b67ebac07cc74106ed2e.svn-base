package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the MAIN_MARCHANDISE database table.
 * 
 */
@Entity
@Table(name="MAIN_MARCHANDISE")
public class MainMarchandise implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MainMarchandisePK id;

	@Column(name="QUANTITE")
	private BigDecimal quantite;
	
	// DEBUT_V0R0_M0012_KRIMOU_20/04/2013
	@Column(name="QUANTITE_IMPORT")
	private BigDecimal quantiteImport;
	@Column(name="QUANTITE_EXPORT")
	private BigDecimal quantiteExport;
	// FIN_V0R0_M0012_KRIMOU_20/04/2013
	
    public MainMarchandise() {
    }

	// DEBUT_V0R0_M0012_KRIMOU_20/04/2013
	//public MainMarchandise(MainMarchandisePK id, BigDecimal quantite) {
	public MainMarchandise(MainMarchandisePK id, BigDecimal quantiteImport,BigDecimal quantiteExport) {
	// FIN_V0R0_M0012_KRIMOU_20/04/2013
		super();
		this.id = id;
		this.quantiteImport = quantiteImport;
		this.quantiteExport = quantiteExport;
		// DEBUT_V0R0_M0012_KRIMOU_20/04/2013
		//this.quantite = quantite;
		this.quantite = quantiteImport.add(quantiteExport);
		// FIN_V0R0_M0012_KRIMOU_20/04/2013
	}

	public MainMarchandisePK getId() {
		return this.id;
	}

	public void setId(MainMarchandisePK id) {
		this.id = id;
	}
	
	public BigDecimal getQuantite() {
		return this.quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	// DEBUT_V0R0_M0012_KRIMOU_20/04/2013
	public BigDecimal getQuantiteImport() {
		return quantiteImport;
	}

	public void setQuantiteImport(BigDecimal quantiteImport) {
		this.quantiteImport = quantiteImport;
	}

	public BigDecimal getQuantiteExport() {
		return quantiteExport;
	}

	public void setQuantiteExport(BigDecimal quantiteExport) {
		this.quantiteExport = quantiteExport;
	}
	// FIN_V0R0_M0012_KRIMOU_20/04/2013
	
}