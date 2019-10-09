package com.example.demo.dto.pay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "valor",
    "cantidadCuotas",
    "codigoMoneda",
    "referencia",
    "numeroFactura",
    "numeroLealtad",
    "propina",
    "impuestos"
})
public class Compra {

    @JsonProperty("valor")
    private Integer valor;
    
    @JsonProperty("cantidadCuotas")
    private Integer cantidadCuotas;
    
    @JsonProperty("codigoMoneda")
    private String codigoMoneda;
    
    @JsonProperty("referencia")
    private String referencia;
    
    @JsonProperty("numeroFactura")
    private String numeroFactura;
    
    @JsonProperty("numeroLealtad")
    private String numeroLealtad;
    
    @JsonProperty("propina")
    private List<Integer> propina = null;
    
    @JsonProperty("impuestos")
    private List<Impuesto> impuestos = null;
   
    @JsonProperty("valor")
    public Integer getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(Integer valor) {
        this.valor = valor;
    }

    @JsonProperty("cantidadCuotas")
    public Integer getCantidadCuotas() {
        return cantidadCuotas;
    }

    @JsonProperty("cantidadCuotas")
    public void setCantidadCuotas(Integer cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    @JsonProperty("codigoMoneda")
    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    @JsonProperty("codigoMoneda")
    public void setCodigoMoneda(String codigoMoneda) {
        this.codigoMoneda = codigoMoneda;
    }

    @JsonProperty("referencia")
    public String getReferencia() {
        return referencia;
    }

    @JsonProperty("referencia")
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    @JsonProperty("numeroFactura")
    public String getNumeroFactura() {
        return numeroFactura;
    }

    @JsonProperty("numeroFactura")
    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    @JsonProperty("numeroLealtad")
    public String getNumeroLealtad() {
        return numeroLealtad;
    }

    @JsonProperty("numeroLealtad")
    public void setNumeroLealtad(String numeroLealtad) {
        this.numeroLealtad = numeroLealtad;
    }

    @JsonProperty("propina")
    public List<Integer> getPropina() {
        return propina;
    }

    @JsonProperty("propina")
    public void setPropina(List<Integer> propina) {
        this.propina = propina;
    }

    @JsonProperty("impuestos")
    public List<Impuesto> getImpuestos() {
        return impuestos;
    }

    @JsonProperty("impuestos")
    public void setImpuestos(List<Impuesto> impuestos) {
        this.impuestos = impuestos;
    }
}