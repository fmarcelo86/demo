package com.example.demo.pay.dto;

import java.util.List;

public class InfoCompra {
	
	private double montoTotal;
	
	private String codMoneda;
	
	private String referencia;
	
	private String numFactura;
	
	private String numLealtad;
	
	private List<Impuestos> impuestos;
	
	private List<MontosAdicionales> montosAdicionales;
	
	private List<InfoAdicional> infoAdicional;

	public double getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(double montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getCodMoneda() {
		return codMoneda;
	}

	public void setCodMoneda(String codMoneda) {
		this.codMoneda = codMoneda;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getNumFactura() {
		return numFactura;
	}

	public void setNumFactura(String numFactura) {
		this.numFactura = numFactura;
	}

	public String getNumLealtad() {
		return numLealtad;
	}

	public void setNumLealtad(String numLealtad) {
		this.numLealtad = numLealtad;
	}

	public List<Impuestos> getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(List<Impuestos> impuestos) {
		this.impuestos = impuestos;
	}

	public List<MontosAdicionales> getMontosAdicionales() {
		return montosAdicionales;
	}

	public void setMontosAdicionales(List<MontosAdicionales> montosAdicionales) {
		this.montosAdicionales = montosAdicionales;
	}

	public List<InfoAdicional> getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(List<InfoAdicional> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}
}
