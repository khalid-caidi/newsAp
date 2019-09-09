package ma.ben.you.soft.entite;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


/**
 * The persistent class for the UTILISATEUR database table.
 * 
 */
@Entity
@Table(name="UTILISATEUR")
@NamedQueries( {
	@NamedQuery(name="Utilisateur.findAll", query="SELECT u FROM Utilisateur u"),
	@NamedQuery(name="Utilisateur.findUserByUserName", query="SELECT u FROM Utilisateur u where u.nomUtilsateur = ?1 and coalesce(u.actif,1)=1")
})
public class Utilisateur implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID_UTILSATEUR")
	private int idUtilsateur;

	@Column(name="ACTIF")
	private int actif;

	@Column(name="MATRICULE_UTILSATEUR")
	private String matriculeUtilsateur;

	@Column(name="NOM_UTILSATEUR")
	private String nomUtilsateur;

	@Column(name="PASSWORD")
	private String password;

	@Column(name="PRENOM_UTILSATEUR")
	private String prenomUtilsateur;
	
	 
	 
    public Utilisateur() {
    }

	public int getIdUtilsateur() {
		return this.idUtilsateur;
	}

	public void setIdUtilsateur(int idUtilsateur) {
		this.idUtilsateur = idUtilsateur;
	}

	public int getActif() {
		return this.actif;
	}

	public void setActif(int actif) {
		this.actif = actif;
	}

	public String getMatriculeUtilsateur() {
		return this.matriculeUtilsateur;
	}

	public void setMatriculeUtilsateur(String matriculeUtilsateur) {
		this.matriculeUtilsateur = matriculeUtilsateur;
	}

	public String getNomUtilsateur() {
		return this.nomUtilsateur;
	}

	public void setNomUtilsateur(String nomUtilsateur) {
		this.nomUtilsateur = nomUtilsateur;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPrenomUtilsateur() {
		return this.prenomUtilsateur;
	}

	public void setPrenomUtilsateur(String prenomUtilsateur) {
		this.prenomUtilsateur = prenomUtilsateur;
	}

	 

}