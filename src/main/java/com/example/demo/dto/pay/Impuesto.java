package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "tipo",
    "valor"
})
public class Impuesto {

    @JsonProperty("tipo")
    private String tipo;
    
    @JsonProperty("valor")
    private Integer valor;
    
    @JsonProperty("tipo")
    public String getTipo() {
        return tipo;
    }

    @JsonProperty("tipo")
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @JsonProperty("valor")
    public Integer getValor() {
        return valor;
    }

    @JsonProperty("valor")
    public void setValor(Integer valor) {
        this.valor = valor;
    }
}