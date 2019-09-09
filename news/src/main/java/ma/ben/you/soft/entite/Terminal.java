package ma.ben.you.soft.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the TERMINAL database table.
 * 
 */
@Entity
@Table(name="TERMINAL")
public class Terminal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_TERMINAL")
	private String codeTerminal;

	@Column(name="DESCRIPTION_TERMINAL")
	private String descriptionTerminal;

	 
}