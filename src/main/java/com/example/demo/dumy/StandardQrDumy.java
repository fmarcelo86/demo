package com.example.demo.dumy;

import java.util.Date;

import com.example.demo.pay.dto.CabeceraRespuesta;
import com.example.demo.pay.dto.CancelPaymentStandardQrResponse;
import com.example.demo.pay.dto.InfoCompraResp;
import com.example.demo.pay.dto.InfoRespuesta;
import com.example.demo.pay.dto.InfoTerminal;
import com.example.demo.pay.dto.InfoUbicacion;
import com.example.demo.pay.dto.PaymentStandardQrResponse;

public class StandardQrDumy {

	public PaymentStandardQrResponse dataPaymentStandardQrDumy() {
		PaymentStandardQrResponse paymentStandardQrResponse = new PaymentStandardQrResponse();

		CabeceraRespuesta cabeceraRespuesta = new CabeceraRespuesta();

		InfoRespuesta infoRespuesta = new InfoRespuesta();
		infoRespuesta.setCodRespuesta("001");
		infoRespuesta.setDescRespuesta("pago");
		infoRespuesta.setEstado("OK");

		InfoCompraResp infoCompraResp = new  InfoCompraResp();
		infoCompraResp.setFechaTransaccion(new Date().toString());
		infoCompraResp.setFechaPosteo(new Date().toString());
		infoCompraResp.setNumAprobacion("999888777");

		InfoTerminal infoTerminal = new InfoTerminal();
		infoTerminal.setNombreAdquiriente("mancos CAP");
		InfoUbicacion infoUbicacion = new InfoUbicacion();
		infoUbicacion.setCiudad("Medellin");
		infoUbicacion.setDepartamento("Antioquia");
		infoUbicacion.setPais("Colombia");
		infoTerminal.setInfoUbicacion(infoUbicacion);

		paymentStandardQrResponse.setCabeceraRespuesta(cabeceraRespuesta);
		paymentStandardQrResponse.setInfoRespuesta(infoRespuesta);
		paymentStandardQrResponse.setInfoCompraResp(infoCompraResp);
		paymentStandardQrResponse.setIdTransaccionAutorizador("111222333444");
		paymentStandardQrResponse.setInfoTerminal(infoTerminal);

		return paymentStandardQrResponse;
	}

	public CancelPaymentStandardQrResponse dataCancelPaymentStandardQrDumy() {
		CancelPaymentStandardQrResponse cancelPaymentStandardQrResponse = new CancelPaymentStandardQrResponse();

		CabeceraRespuesta cabeceraRespuesta = new CabeceraRespuesta();

		InfoRespuesta infoRespuesta = new InfoRespuesta();
		infoRespuesta.setCodRespuesta("001");
		infoRespuesta.setDescRespuesta("pago");
		infoRespuesta.setEstado("OK");

		InfoCompraResp infoCompraResp = new  InfoCompraResp();
		infoCompraResp.setFechaTransaccion(new Date().toString());
		infoCompraResp.setFechaPosteo(new Date().toString());
		infoCompraResp.setNumAprobacion("999888777");

		InfoTerminal infoTerminal = new InfoTerminal();
		infoTerminal.setNombreAdquiriente("mancos CAP");
		InfoUbicacion infoUbicacion = new InfoUbicacion();
		infoUbicacion.setCiudad("Medellin");
		infoUbicacion.setDepartamento("Antioquia");
		infoUbicacion.setPais("Colombia");
		infoTerminal.setInfoUbicacion(infoUbicacion);

		cancelPaymentStandardQrResponse.setCabeceraRespuesta(cabeceraRespuesta);
		cancelPaymentStandardQrResponse.setInfoRespuesta(infoRespuesta);
		cancelPaymentStandardQrResponse.setInfoCompraResp(infoCompraResp);
		cancelPaymentStandardQrResponse.setIdTransaccionAutorizador("111222333444");
		cancelPaymentStandardQrResponse.setInfoTerminal(infoTerminal);

		return cancelPaymentStandardQrResponse;
	}

}
