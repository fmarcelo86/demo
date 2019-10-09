package com.example.demo.pay.dto;

public class InfoTarjeta {

	private String franquicia;
	
	private String numTarjeta;
	
	private String idTarjeta;
	
	private String fechaExpiracion;
	
	private String codVerificacion;

	public String getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(String franquicia) {
		this.franquicia = franquicia;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getIdTarjeta() {
		return idTarjeta;
	}

	public void setIdTarjeta(String idTarjeta) {
		this.idTarjeta = idTarjeta;
	}

	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getCodVerificacion() {
		return codVerificacion;
	}

	public void setCodVerificacion(String codVerificacion) {
		this.codVerificacion = codVerificacion;
	}
}
