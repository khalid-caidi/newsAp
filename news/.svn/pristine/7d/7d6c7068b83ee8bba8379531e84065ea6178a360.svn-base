package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the DETAILPLANROULEMENT database table.
 * 
 */
@Entity
@Table(name="DETAILPLANROULEMENT")
public class Detailplanroulement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id_detailPlanRoulement")
	private int id_detailPlanRoulement;

	private boolean dimanche;

	private int id_planRoulement;

	private boolean jeudi;

	private boolean lundi;

	private boolean mardi;

	private boolean mercredi;

	private int ordre;

	private boolean samedi;

	private boolean vendredi;

	//bi-directional many-to-one association to Equipe
    @ManyToOne
	@JoinColumn(name="id_equipe")
	private Equipe equipe;

    public Detailplanroulement() {
    }

	public int getId_detailPlanRoulement() {
		return this.id_detailPlanRoulement;
	}

	public void setId_detailPlanRoulement(int id_detailPlanRoulement) {
		this.id_detailPlanRoulement = id_detailPlanRoulement;
	}

	public boolean getDimanche() {
		return this.dimanche;
	}

	public void setDimanche(boolean dimanche) {
		this.dimanche = dimanche;
	}

	public int getId_planRoulement() {
		return this.id_planRoulement;
	}

	public void setId_planRoulement(int id_planRoulement) {
		this.id_planRoulement = id_planRoulement;
	}

	public boolean getJeudi() {
		return this.jeudi;
	}

	public void setJeudi(boolean jeudi) {
		this.jeudi = jeudi;
	}

	public boolean getLundi() {
		return this.lundi;
	}

	public void setLundi(boolean lundi) {
		this.lundi = lundi;
	}

	public boolean getMardi() {
		return this.mardi;
	}

	public void setMardi(boolean mardi) {
		this.mardi = mardi;
	}

	public boolean getMercredi() {
		return this.mercredi;
	}

	public void setMercredi(boolean mercredi) {
		this.mercredi = mercredi;
	}

	public int getOrdre() {
		return this.ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public boolean getSamedi() {
		return this.samedi;
	}

	public void setSamedi(boolean samedi) {
		this.samedi = samedi;
	}

	public boolean getVendredi() {
		return this.vendredi;
	}

	public void setVendredi(boolean vendredi) {
		this.vendredi = vendredi;
	}

	public Equipe getEquipe() {
		return this.equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}
	
}