package com.example.demo.dto.pay;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tipoTransaccion",
    "red",
    "walletID",
    "puntoInteraccion",
    "cliente",
    "comercio",
    "medioDePago",
    "compra"
})
public class DataPayRequest {

    @JsonProperty("tipoTransaccion")
    private String tipoTransaccion;
    
    @JsonProperty("red")
    private String red;
    
    @JsonProperty("walletID")
    private List<List<String>> walletID = null;
    
    @JsonProperty("puntoInteraccion")
    private PuntoInteraccion puntoInteraccion;
    
    @JsonProperty("cliente")
    private Cliente cliente;
    
    @JsonProperty("comercio")
    private Comercio comercio;
    
    @JsonProperty("medioDePago")
    private MedioDePago medioDePago;
    
    @JsonProperty("compra")
    private Compra compra;
    
    @JsonProperty("tipoTransaccion")
    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    @JsonProperty("tipoTransaccion")
    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    @JsonProperty("red")
    public String getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(String red) {
        this.red = red;
    }

    @JsonProperty("walletID")
    public List<List<String>> getWalletID() {
        return walletID;
    }

    @JsonProperty("walletID")
    public void setWalletID(List<List<String>> walletID) {
        this.walletID = walletID;
    }

    @JsonProperty("puntoInteraccion")
    public PuntoInteraccion getPuntoInteraccion() {
        return puntoInteraccion;
    }

    @JsonProperty("puntoInteraccion")
    public void setPuntoInteraccion(PuntoInteraccion puntoInteraccion) {
        this.puntoInteraccion = puntoInteraccion;
    }

    @JsonProperty("cliente")
    public Cliente getCliente() {
        return cliente;
    }

    @JsonProperty("cliente")
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @JsonProperty("comercio")
    public Comercio getComercio() {
        return comercio;
    }

    @JsonProperty("comercio")
    public void setComercio(Comercio comercio) {
        this.comercio = comercio;
    }

    @JsonProperty("medioDePago")
    public MedioDePago getMedioDePago() {
        return medioDePago;
    }

    @JsonProperty("medioDePago")
    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }

    @JsonProperty("compra")
    public Compra getCompra() {
        return compra;
    }

    @JsonProperty("compra")
    public void setCompra(Compra compra) {
        this.compra = compra;
    }
}