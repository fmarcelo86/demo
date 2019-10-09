package com.example.demo.pay.dto;

public class InfoTerminal {

	private String nombreAdquiriente;
	
	private InfoUbicacion infoUbicacion;

	public String getNombreAdquiriente() {
		return nombreAdquiriente;
	}

	public void setNombreAdquiriente(String nombreAdquiriente) {
		this.nombreAdquiriente = nombreAdquiriente;
	}

	public InfoUbicacion getInfoUbicacion() {
		return infoUbicacion;
	}

	public void setInfoUbicacion(InfoUbicacion infoUbicacion) {
		this.infoUbicacion = infoUbicacion;
	}
}
