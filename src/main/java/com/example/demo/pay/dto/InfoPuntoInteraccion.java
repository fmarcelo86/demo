package com.example.demo.pay.dto;

public class InfoPuntoInteraccion {
	private String tipoDispositivo;
	
	private String tipoQR;

	private String idTerminal;
	
    private String codigoUnico;
    
    private String codigoUnicoAgregador;
    
    private String idTransaccionTerminal;
    
    private String modoCapturaPAN;
    
    private String capacidadPIN;
    
    private String codigoSeguridad;
    
	public String getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(String tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

	public String getTipoQR() {
		return tipoQR;
	}

	public void setTipoQR(String tipoQR) {
		this.tipoQR = tipoQR;
	}

	public String getIdTerminal() {
		return idTerminal;
	}

	public void setIdTerminal(String idTerminal) {
		this.idTerminal = idTerminal;
	}

	public String getCodigoUnico() {
		return codigoUnico;
	}

	public void setCodigoUnico(String codigoUnico) {
		this.codigoUnico = codigoUnico;
	}

	public String getCodigoUnicoAgregador() {
		return codigoUnicoAgregador;
	}

	public void setCodigoUnicoAgregador(String codigoUnicoAgregador) {
		this.codigoUnicoAgregador = codigoUnicoAgregador;
	}

	public String getIdTransaccionTerminal() {
		return idTransaccionTerminal;
	}

	public void setIdTransaccionTerminal(String idTransaccionTerminal) {
		this.idTransaccionTerminal = idTransaccionTerminal;
	}

	public String getModoCapturaPAN() {
		return modoCapturaPAN;
	}

	public void setModoCapturaPAN(String modoCapturaPAN) {
		this.modoCapturaPAN = modoCapturaPAN;
	}

	public String getCapacidadPIN() {
		return capacidadPIN;
	}

	public void setCapacidadPIN(String capacidadPIN) {
		this.capacidadPIN = capacidadPIN;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}
}
