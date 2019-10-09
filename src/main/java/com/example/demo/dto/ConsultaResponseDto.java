package com.example.demo.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ConsultaResponseDto {
	
	@JsonInclude(Include.NON_NULL)
	private List<InformacionTarjetaResponse> informacionTarjetaResponse;
	
	public List<InformacionTarjetaResponse> getInformacionTarjetaResponse() {
		return informacionTarjetaResponse;
	}
	
	public void setInformacionTarjetaResponse(List<InformacionTarjetaResponse> informacionTarjetaResponse) {
		this.informacionTarjetaResponse = informacionTarjetaResponse;
	}
}
