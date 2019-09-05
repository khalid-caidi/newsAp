package ma.marsamaroc.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.List;



public class PortDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String codPort;
	private String libPort;
	private List<TerminalDTO> listTerminal;

	public PortDTO() {
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

	public List<TerminalDTO> getListTerminal() {
		return listTerminal;
	}

	public void setListTerminal(List<TerminalDTO> listTerminal) {
		this.listTerminal = listTerminal;
	}

}