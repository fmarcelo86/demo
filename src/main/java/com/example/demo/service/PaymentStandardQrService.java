package com.example.demo.service;

import com.example.demo.dto.pay.StandardQrResponseDto;

public interface PaymentStandardQrService {

	public StandardQrResponseDto pay();
	
	public StandardQrResponseDto cancelPay();
}
