package com.example.demo.pay.dto;

import java.util.List;

public class CancelPaymentStandardQrRequest {
	
	private InfoAutorizacion infoAutorizacion; 
	
	private InfoPuntoInteraccion infoPuntoInteraccion;
	
	private InfoPersona infoPersona;
	
	private InfoComercio infoComercio;
	
	private List<InfoAdicional> infoAdicional;
	
	private InfoMedioPago infoMedioPago;
	
	private InfoCompra infoCompra;
	
	public InfoAutorizacion getInfoAutorizacion() {
		return infoAutorizacion;
	}

	public void setInfoAutorizacion(InfoAutorizacion infoAutorizacion) {
		this.infoAutorizacion = infoAutorizacion;
	}

	public InfoPuntoInteraccion getInfoPuntoInteraccion() {
		return infoPuntoInteraccion;
	}

	public void setInfoPuntoInteraccion(InfoPuntoInteraccion infoPuntoInteraccion) {
		this.infoPuntoInteraccion = infoPuntoInteraccion;
	}

	public InfoPersona getInfoPersona() {
		return infoPersona;
	}

	public void setInfoPersona(InfoPersona infoPersona) {
		this.infoPersona = infoPersona;
	}

	public InfoComercio getInfoComercio() {
		return infoComercio;
	}

	public void setInfoComercio(InfoComercio infoComercio) {
		this.infoComercio = infoComercio;
	}

	public List<InfoAdicional> getInfoAdicional() {
		return infoAdicional;
	}

	public void setInfoAdicional(List<InfoAdicional> infoAdicional) {
		this.infoAdicional = infoAdicional;
	}

	public InfoMedioPago getInfoMedioPago() {
		return infoMedioPago;
	}

	public void setInfoMedioPago(InfoMedioPago infoMedioPago) {
		this.infoMedioPago = infoMedioPago;
	}

	public InfoCompra getInfoCompra() {
		return infoCompra;
	}

	public void setInfoCompra(InfoCompra infoCompra) {
		this.infoCompra = infoCompra;
	}
}
