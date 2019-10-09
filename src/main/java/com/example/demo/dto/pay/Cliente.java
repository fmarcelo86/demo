package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tipoDocumento",
    "numDocumento",
    "celular"
})
public class Cliente {

    @JsonProperty("tipoDocumento")
    private String tipoDocumento;
    
    @JsonProperty("numDocumento")
    private String numDocumento;
    
    @JsonProperty("celular")
    private String celular;
    
    @JsonProperty("tipoDocumento")
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @JsonProperty("tipoDocumento")
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @JsonProperty("numDocumento")
    public String getNumDocumento() {
        return numDocumento;
    }

    @JsonProperty("numDocumento")
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @JsonProperty("celular")
    public String getCelular() {
        return celular;
    }

    @JsonProperty("celular")
    public void setCelular(String celular) {
        this.celular = celular;
    }
}