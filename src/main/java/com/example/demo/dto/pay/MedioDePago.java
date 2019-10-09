package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tipo",
    "franquicia",
    "numeroTarjeta",
    "fechaExpiracion",
    "codigoVerificacion"
})
public class MedioDePago {

    @JsonProperty("tipo")
    private String tipo;
    
    @JsonProperty("franquicia")
    private String franquicia;
    
    @JsonProperty("numeroTarjeta")
    private String numeroTarjeta;
    
    @JsonProperty("fechaExpiracion")
    private String fechaExpiracion;
    
    @JsonProperty("codigoVerificacion")
    private String codigoVerificacion;
    
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("franquicia")
    public String getFranquicia() {
        return franquicia;
    }

    @JsonProperty("franquicia")
    public void setFranquicia(String franquicia) {
        this.franquicia = franquicia;
    }

    @JsonProperty("numeroTarjeta")
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    @JsonProperty("numeroTarjeta")
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @JsonProperty("fechaExpiracion")
    public String getFechaExpiracion() {
        return fechaExpiracion;
    }

    @JsonProperty("fechaExpiracion")
    public void setFechaExpiracion(String fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @JsonProperty("codigoVerificacion")
    public String getCodigoVerificacion() {
        return codigoVerificacion;
    }

    @JsonProperty("codigoVerificacion")
    public void setCodigoVerificacion(String codigoVerificacion) {
        this.codigoVerificacion = codigoVerificacion;
    }
}