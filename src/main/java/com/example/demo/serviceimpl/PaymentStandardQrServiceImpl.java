package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dto.pay.StandardQrResponseDto;
import com.example.demo.dumy.CancelPayStandardQrDumy;
import com.example.demo.dumy.PayStandardQrDumy;
import com.example.demo.service.PaymentStandardQrService;

@Service
public class PaymentStandardQrServiceImpl implements PaymentStandardQrService {
	
	@Override
	public StandardQrResponseDto pay() {
		
		StandardQrResponseDto standardQrResponseDto = null;
		PayStandardQrDumy payStandardQrDumy = new PayStandardQrDumy();
		
		standardQrResponseDto = payStandardQrDumy.dataPaymentStandardQrDumy();
		
		return standardQrResponseDto;
	}

	@Override
	public StandardQrResponseDto cancelPay() {
		StandardQrResponseDto standardQrResponseDto = null;
		CancelPayStandardQrDumy cancelPayStandardQrDumy = new CancelPayStandardQrDumy();
		
		standardQrResponseDto = cancelPayStandardQrDumy.dataCancelPaymentStandardQrDumy();
		
		return standardQrResponseDto;
	}
}
