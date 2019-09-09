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
@Table(name="Newspaper")
public class Newspaper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE")
	private String code;

	@Column(name="DATE_CREATION")
	private Date dateCreation;

	 
}