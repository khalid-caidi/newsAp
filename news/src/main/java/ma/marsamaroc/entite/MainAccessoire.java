package ma.marsamaroc.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="MAIN_ACCESSOIRE")
public class MainAccessoire implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private MainAccessoirePK id;
	
	@Column(name="NOMBRE_AFFECTES")
	private int nombreAffectes;

	public MainAccessoirePK getId() {
		return id;
	}

	public void setId(MainAccessoirePK id) {
		this.id = id;
	}

	public int getNombreAffectes() {
		return nombreAffectes;
	}

	public void setNombreAffectes(int nombreAffectes) {
		this.nombreAffectes = nombreAffectes;
	}
}
