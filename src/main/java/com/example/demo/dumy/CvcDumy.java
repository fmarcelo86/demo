package com.example.demo.dumy;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.ConsultaResponseDto;
import com.example.demo.dto.InformacionTarjetaResponse;

public class CvcDumy {

	public ConsultaResponseDto dataCvcDumy() {

		List<InformacionTarjetaResponse> informacionTarjetaResponseList = new ArrayList<>();
		
		InformacionTarjetaResponse informacionTarjetaResponse1 = new InformacionTarjetaResponse();
		informacionTarjetaResponse1.setNumeroTarjeta("5306917000028337");
		informacionTarjetaResponse1.setCodigoSeguridad("123");
		informacionTarjetaResponseList.add(informacionTarjetaResponse1);

		InformacionTarjetaResponse informacionTarjetaResponse2 = new InformacionTarjetaResponse();
		informacionTarjetaResponse2.setNumeroTarjeta("6016607120487492");
		informacionTarjetaResponse2.setCodigoSeguridad("456");
		informacionTarjetaResponseList.add(informacionTarjetaResponse2);
		
		InformacionTarjetaResponse informacionTarjetaResponse3 = new InformacionTarjetaResponse();
		informacionTarjetaResponse3.setNumeroTarjeta("5306953325246817");
		informacionTarjetaResponse3.setCodigoSeguridad("789");
		informacionTarjetaResponseList.add(informacionTarjetaResponse3);		
		
		ConsultaResponseDto consultaResponseDto = new ConsultaResponseDto();
		consultaResponseDto.setInformacionTarjetaResponse(informacionTarjetaResponseList);

		return consultaResponseDto;

	}

}
