package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tipoDispositivo",
    "tipoQR",
    "idTerminal",
    "codigoUnico",
    "codigoUnicoAgregador",
    "idTransaccionTerminal",
    "modoCapturaPAN",
    "capacidadPIN",
    "codigoSeguridad"
})
public class PuntoInteraccion {

    @JsonProperty("tipoDispositivo")
    private String tipoDispositivo;
    
    @JsonProperty("tipoQR")
    private String tipoQR;
    
    @JsonProperty("idTerminal")
    private String idTerminal;
    
    @JsonProperty("codigoUnico")
    private String codigoUnico;
    
    @JsonProperty("codigoUnicoAgregador")
    private String codigoUnicoAgregador;
    
    @JsonProperty("idTransaccionTerminal")
    private String idTransaccionTerminal;
    
    @JsonProperty("modoCapturaPAN")
    private String modoCapturaPAN;
    
    @JsonProperty("capacidadPIN")
    private String capacidadPIN;
    
    @JsonProperty("codigoSeguridad")
    private String codigoSeguridad;
    
    @JsonProperty("tipoDispositivo")
    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    @JsonProperty("tipoDispositivo")
    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    @JsonProperty("tipoQR")
    public String getTipoQR() {
        return tipoQR;
    }

    @JsonProperty("tipoQR")
    public void setTipoQR(String tipoQR) {
        this.tipoQR = tipoQR;
    }

    @JsonProperty("idTerminal")
    public String getIdTerminal() {
        return idTerminal;
    }

    @JsonProperty("idTerminal")
    public void setIdTerminal(String idTerminal) {
        this.idTerminal = idTerminal;
    }

    @JsonProperty("codigoUnico")
    public String getCodigoUnico() {
        return codigoUnico;
    }

    @JsonProperty("codigoUnico")
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    @JsonProperty("codigoUnicoAgregador")
    public String getCodigoUnicoAgregador() {
        return codigoUnicoAgregador;
    }

    @JsonProperty("codigoUnicoAgregador")
    public void setCodigoUnicoAgregador(String codigoUnicoAgregador) {
        this.codigoUnicoAgregador = codigoUnicoAgregador;
    }

    @JsonProperty("idTransaccionTerminal")
    public String getIdTransaccionTerminal() {
        return idTransaccionTerminal;
    }

    @JsonProperty("idTransaccionTerminal")
    public void setIdTransaccionTerminal(String idTransaccionTerminal) {
        this.idTransaccionTerminal = idTransaccionTerminal;
    }

    @JsonProperty("modoCapturaPAN")
    public String getModoCapturaPAN() {
        return modoCapturaPAN;
    }

    @JsonProperty("modoCapturaPAN")
    public void setModoCapturaPAN(String modoCapturaPAN) {
        this.modoCapturaPAN = modoCapturaPAN;
    }

    @JsonProperty("capacidadPIN")
    public String getCapacidadPIN() {
        return capacidadPIN;
    }

    @JsonProperty("capacidadPIN")
    public void setCapacidadPIN(String capacidadPIN) {
        this.capacidadPIN = capacidadPIN;
    }

    @JsonProperty("codigoSeguridad")
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }

    @JsonProperty("codigoSeguridad")
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
}