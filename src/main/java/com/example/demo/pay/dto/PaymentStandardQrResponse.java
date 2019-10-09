package com.example.demo.pay.dto;

public class PaymentStandardQrResponse {

	private CabeceraRespuesta cabeceraRespuesta;
	
	private InfoRespuesta infoRespuesta;
	
	private InfoCompraResp infoCompraResp;
	
	private String idTransaccionAutorizador;
	
	private InfoTerminal infoTerminal;

	public CabeceraRespuesta getCabeceraRespuesta() {
		return cabeceraRespuesta;
	}

	public void setCabeceraRespuesta(CabeceraRespuesta cabeceraRespuesta) {
		this.cabeceraRespuesta = cabeceraRespuesta;
	}

	public InfoRespuesta getInfoRespuesta() {
		return infoRespuesta;
	}

	public void setInfoRespuesta(InfoRespuesta infoRespuesta) {
		this.infoRespuesta = infoRespuesta;
	}

	public InfoCompraResp getInfoCompraResp() {
		return infoCompraResp;
	}

	public void setInfoCompraResp(InfoCompraResp infoCompraResp) {
		this.infoCompraResp = infoCompraResp;
	}

	public String getIdTransaccionAutorizador() {
		return idTransaccionAutorizador;
	}

	public void setIdTransaccionAutorizador(String idTransaccionAutorizador) {
		this.idTransaccionAutorizador = idTransaccionAutorizador;
	}

	public InfoTerminal getInfoTerminal() {
		return infoTerminal;
	}

	public void setInfoTerminal(InfoTerminal infoTerminal) {
		this.infoTerminal = infoTerminal;
	}
}
