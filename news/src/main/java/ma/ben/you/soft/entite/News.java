package ma.ben.you.soft.entite;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.Set;


/**
 * The persistent class for the TERMINAL database table.
 * 
 */
@Entity
@Table(name="NEWS")
public class News implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE")
	private String code;

	@Column(name="DATE_CREATION")
	private Date dateCreation;

	private Newspaper newspaper;
	@Column(name="TITRE")
	private String titre;
	@Column(name="IMAGE")

	private byte[] image;
	@Column(name="VUES")

	private int vues;
	
	 
}