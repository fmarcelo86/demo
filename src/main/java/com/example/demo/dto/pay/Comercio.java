package com.example.demo.dto.pay;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "codigoMCC",
    "nombre",
    "codigoCiudad",
    "codigoPostal"
})
public class Comercio {

    @JsonProperty("codigoMCC")
    private String codigoMCC;
    
    @JsonProperty("nombre")
    private String nombre;
    
    @JsonProperty("codigoCiudad")
    private String codigoCiudad;
    
    @JsonProperty("codigoPostal")
    private String codigoPostal;
    
    @JsonProperty("codigoMCC")
    public String getCodigoMCC() {
        return codigoMCC;
    }

    @JsonProperty("codigoMCC")
    public void setCodigoMCC(String codigoMCC) {
        this.codigoMCC = codigoMCC;
    }

    @JsonProperty("nombre")
    public String getNombre() {
        return nombre;
    }

    @JsonProperty("nombre")
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @JsonProperty("codigoCiudad")
    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    @JsonProperty("codigoCiudad")
    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    @JsonProperty("codigoPostal")
    public String getCodigoPostal() {
        return codigoPostal;
    }

    @JsonProperty("codigoPostal")
    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
}