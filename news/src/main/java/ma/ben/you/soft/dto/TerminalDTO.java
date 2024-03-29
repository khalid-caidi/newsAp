package ma.ben.you.soft.dto;

import java.io.Serializable;
import java.util.List;


public class TerminalDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String codTerminal;
	private String libTerminal;
	private List<String> roles;
	
	
	public TerminalDTO() {
	}

	public String getCodTerminal() {
		return codTerminal;
	}

	public void setCodTerminal(String codTerminal) {
		this.codTerminal = codTerminal;
	}

	public String getLibTerminal() {
		return libTerminal;
	}

	public void setLibTerminal(String libTerminal) {
		this.libTerminal = libTerminal;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	
	
}