package com.example.demo.pay.dto;

public class InfoMedioPago {
	
	private String tipo;
	
	private int numCuotas;
	
	private InfoTarjeta infoTarjeta;
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumCuotas() {
		return numCuotas;
	}

	public void setNumCuotas(int numCuotas) {
		this.numCuotas = numCuotas;
	}

	public InfoTarjeta getInfoTarjeta() {
		return infoTarjeta;
	}

	public void setInfoTarjeta(InfoTarjeta infoTarjeta) {
		this.infoTarjeta = infoTarjeta;
	}
}
