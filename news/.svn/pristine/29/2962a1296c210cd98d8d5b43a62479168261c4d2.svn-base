package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the [ACTION] database table.
 * 
 */
@Entity
@Table(name="[ACTION]")
public class Action implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_ACTION")
	private String codeAction;

	//bi-directional many-to-one association to Menu
    @ManyToOne
	@JoinColumn(name="CODE_MENU")
	private Menu menu;


	//bi-directional many-to-many association to Profil
    @ManyToMany(mappedBy="actions")
	private Set<Profil> profils;

    public Action() {
    }

	public String getCodeAction() {
		return this.codeAction;
	}

	public void setCodeAction(String codeAction) {
		this.codeAction = codeAction;
	}

	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public Set<Profil> getProfils() {
		return this.profils;
	}

	public void setProfils(Set<Profil> profils) {
		this.profils = profils;
	}
	
}