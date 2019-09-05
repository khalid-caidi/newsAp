package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the MENU database table.
 * 
 */
@Entity
@Table(name="MENU")
public class Menu implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_MENU")
	private String codeMenu;
	
	@Column(name="LIBELLE_MENU")
	private String libelleMenu;

	//bi-directional many-to-one association to Action
	@OneToMany(mappedBy="menu")
	private Set<Action> actions;

	//bi-directional many-to-one association to Menu
    @ManyToOne
	@JoinColumn(name="CODE_MENU_RECINE")
	private Menu menu;

	//bi-directional many-to-one association to Menu
	@OneToMany(mappedBy="menu")
	private Set<Menu> menus;

    public Menu() {
    }

	public String getCodeMenu() {
		return this.codeMenu;
	}

	public void setCodeMenu(String codeMenu) {
		this.codeMenu = codeMenu;
	}

	public Set<Action> getActions() {
		return this.actions;
	}

	public void setActions(Set<Action> actions) {
		this.actions = actions;
	}
	
	public Menu getMenu() {
		return this.menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
	public Set<Menu> getMenus() {
		return this.menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	public String getLibelleMenu() {
		return libelleMenu;
	}

	public void setLibelleMenu(String libelleMenu) {
		this.libelleMenu = libelleMenu;
	}
	
}