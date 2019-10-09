package com.example.demo.dumy;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.pay.DataResponse;
import com.example.demo.dto.pay.MetaResponse;
import com.example.demo.dto.pay.StandardQrResponseDto;

public class PayStandardQrDumy {

	public StandardQrResponseDto dataPaymentStandardQrDumy() {
    		
		MetaResponse metaResponse = new MetaResponse();
    	metaResponse.setSystemId("InvesBot");
    	metaResponse.setMessageId("001");
    	metaResponse.setTimestamp("2017-01-24T05:00:00.000Z");
    	metaResponse.setStatusCode("Success");
    	
    	DataResponse dataResponse = new DataResponse();
    	dataResponse.setEstadoTransaccion("Pago aprobado");
    	dataResponse.setDescripcion("Tarjeta Restringida");
    	dataResponse.setFechaCompra("2019-10-04");
    	dataResponse.setFechaPosteo("2019-10-04");
    	dataResponse.setNumeroAprobacion("111222333");
    	dataResponse.setCiudad("05001");
    	dataResponse.setDepartamento("ATI");
    	dataResponse.setPais("CO");
    	dataResponse.setIdTransaccionAutorizador("098765");
    	dataResponse.setNombreAdquiriente("CAP");
    	
    	List<DataResponse> dataResponseList = new ArrayList<>();
    	dataResponseList.add(dataResponse);
    	
    	StandardQrResponseDto standardQrResponseDto = new StandardQrResponseDto();
    	standardQrResponseDto.setMetaResponse(metaResponse);
    	standardQrResponseDto.setDataResponse(dataResponseList);
    	
    	return standardQrResponseDto;
	}
}