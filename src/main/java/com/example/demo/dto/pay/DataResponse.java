package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "estadoTransaccion",
    "descripcion",
    "fechaCompra",
    "fechaPosteo",
    "numeroAprobacion",
    "ciudad",
    "departamento",
    "pais",
    "idTransaccionAutorizador",
    "nombreAdquiriente"
})
public class DataResponse {

    @JsonProperty("estadoTransaccion")
    private String estadoTransaccion;
    
    @JsonProperty("descripcion")
    private String descripcion;
    
    @JsonProperty("fechaCompra")
    private String fechaCompra;
    
    @JsonProperty("fechaPosteo")
    private String fechaPosteo;
    
    @JsonProperty("numeroAprobacion")
    private String numeroAprobacion;
    
    @JsonProperty("ciudad")
    private String ciudad;
    
    @JsonProperty("departamento")
    private String departamento;
    
    @JsonProperty("pais")
    private String pais;
    
    @JsonProperty("idTransaccionAutorizador")
    private String idTransaccionAutorizador;
    
    @JsonProperty("nombreAdquiriente")
    private String nombreAdquiriente;
    
    @JsonProperty("estadoTransaccion")
    public String getEstadoTransaccion() {
        return estadoTransaccion;
    }

    @JsonProperty("estadoTransaccion")
    public void setEstadoTransaccion(String estadoTransaccion) {
        this.estadoTransaccion = estadoTransaccion;
    }

    @JsonProperty("descripcion")
    public String getDescripcion() {
        return descripcion;
    }

    @JsonProperty("descripcion")
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @JsonProperty("fechaCompra")
    public String getFechaCompra() {
        return fechaCompra;
    }

    @JsonProperty("fechaCompra")
    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    @JsonProperty("fechaPosteo")
    public String getFechaPosteo() {
        return fechaPosteo;
    }

    @JsonProperty("fechaPosteo")
    public void setFechaPosteo(String fechaPosteo) {
        this.fechaPosteo = fechaPosteo;
    }

    @JsonProperty("numeroAprobacion")
    public String getNumeroAprobacion() {
        return numeroAprobacion;
    }

    @JsonProperty("numeroAprobacion")
    public void setNumeroAprobacion(String numeroAprobacion) {
        this.numeroAprobacion = numeroAprobacion;
    }

    @JsonProperty("ciudad")
    public String getCiudad() {
        return ciudad;
    }

    @JsonProperty("ciudad")
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @JsonProperty("departamento")
    public String getDepartamento() {
        return departamento;
    }

    @JsonProperty("departamento")
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @JsonProperty("pais")
    public String getPais() {
        return pais;
    }

    @JsonProperty("pais")
    public void setPais(String pais) {
        this.pais = pais;
    }

    @JsonProperty("idTransaccionAutorizador")
    public String getIdTransaccionAutorizador() {
        return idTransaccionAutorizador;
    }

    @JsonProperty("idTransaccionAutorizador")
    public void setIdTransaccionAutorizador(String idTransaccionAutorizador) {
        this.idTransaccionAutorizador = idTransaccionAutorizador;
    }

    @JsonProperty("nombreAdquiriente")
    public String getNombreAdquiriente() {
        return nombreAdquiriente;
    }

    @JsonProperty("nombreAdquiriente")
    public void setNombreAdquiriente(String nombreAdquiriente) {
        this.nombreAdquiriente = nombreAdquiriente;
    }
}
