package ma.ben.you.soft.dto;

import java.io.Serializable;
import java.util.Date;

public class UtilisateurDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer idUser;
	private String username;
	private String email;
	private String password;
	private String pwdClair;
	private String pwdClairMatched;
	private String pwdReset;
	private String userCreat;
	private String userModif;
	private Date datCreat;
	private Date datModif;
	private Integer indSupp;
	
	
	public Integer getIdUser() {
		return idUser;
	}
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwdClair() {
		return pwdClair;
	}
	public void setPwdClair(String pwdClair) {
		this.pwdClair = pwdClair;
	}
	public String getPwdReset() {
		return pwdReset;
	}
	public void setPwdReset(String pwdReset) {
		this.pwdReset = pwdReset;
	}
	public String getUserCreat() {
		return userCreat;
	}
	public void setUserCreat(String userCreat) {
		this.userCreat = userCreat;
	}
	public String getUserModif() {
		return userModif;
	}
	public void setUserModif(String userModif) {
		this.userModif = userModif;
	}
	public Date getDatCreat() {
		return datCreat;
	}
	public void setDatCreat(Date datCreat) {
		this.datCreat = datCreat;
	}
	public Date getDatModif() {
		return datModif;
	}
	public void setDatModif(Date datModif) {
		this.datModif = datModif;
	}
	public Integer getIndSupp() {
		return indSupp;
	}
	public void setIndSupp(Integer indSupp) {
		this.indSupp = indSupp;
	}
	public String getPwdClairMatched() {
		return pwdClairMatched;
	}
	public void setPwdClairMatched(String pwdClairMatched) {
		this.pwdClairMatched = pwdClairMatched;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
