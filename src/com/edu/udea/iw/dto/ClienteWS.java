package com.edu.udea.iw.dto;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class ClienteWS {
	
	private String Cedula;
	private String Nombres;
	private String Apellidos;	
	private String Email;
	
	
	public String getCedula() {
		return Cedula;
	}
	public void setCedula(String cedula) {
		Cedula = cedula;
	}
	public String getNombres() {
		return Nombres;
	}
	public void setNombres(String nombres) {
		Nombres = nombres;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}

}
