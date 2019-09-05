package ma.marsamaroc.entite;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Set;


/**
 * The persistent class for the PORT database table.
 * 
 */
@Entity
@Table(name="PORT")
public class Port implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="CODE_PORT")
	private String codePort;

	@Column(name="DESCRIPTION_PORT")
	private String descriptionPort;

	//bi-directional many-to-one association to Terminal
	@OneToMany(mappedBy="port")
	private Set<Terminal> terminals;

    public Port() {
    }

	public String getCodePort() {
		return this.codePort;
	}

	public void setCodePort(String codePort) {
		this.codePort = codePort;
	}

	public String getDescriptionPort() {
		return this.descriptionPort;
	}

	public void setDescriptionPort(String descriptionPort) {
		this.descriptionPort = descriptionPort;
	}

	public Set<Terminal> getTerminals() {
		return this.terminals;
	}

	public void setTerminals(Set<Terminal> terminals) {
		this.terminals = terminals;
	}
	
}