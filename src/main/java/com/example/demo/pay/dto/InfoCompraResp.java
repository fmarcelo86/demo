package com.example.demo.pay.dto;

public class InfoCompraResp {

	private String fechaTransaccion;
	
	private String fechaPosteo;
	
	private String numAprobacion;

	public String getFechaTransaccion() {
		return fechaTransaccion;
	}

	public void setFechaTransaccion(String fechaTransaccion) {
		this.fechaTransaccion = fechaTransaccion;
	}

	public String getFechaPosteo() {
		return fechaPosteo;
	}

	public void setFechaPosteo(String fechaPosteo) {
		this.fechaPosteo = fechaPosteo;
	}

	public String getNumAprobacion() {
		return numAprobacion;
	}

	public void setNumAprobacion(String numAprobacion) {
		this.numAprobacion = numAprobacion;
	}
}
