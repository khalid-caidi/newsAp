package ma.ben.you.soft.dto;

import java.io.Serializable;



public class AutorisationDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// Terminal 
	private String codTerminal;
	private String libTerminal;
	// Port
	private String codPort;
	private String libPort;
	// ACTION
	private String codAction;
	
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
	public String getCodPort() {
		return codPort;
	}
	public void setCodPort(String codPort) {
		this.codPort = codPort;
	}
	public String getLibPort() {
		return libPort;
	}
	public void setLibPort(String libPort) {
		this.libPort = libPort;
	}
	public String getCodAction() {
		return codAction;
	}
	public void setCodAction(String codAction) {
		this.codAction = codAction;
	}
	
}