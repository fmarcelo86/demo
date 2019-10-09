package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.pay.StandardQrResponseDto;
import com.example.demo.service.PaymentStandardQrService;

@RestController
public class PaymentStandardQrController {
	
	@Autowired
	private PaymentStandardQrService paymentStandardQrService;
	
	@GetMapping("/test")
	public ResponseEntity<StandardQrResponseDto> test(){
		
		StandardQrResponseDto standardQrResponseDto = paymentStandardQrService.pay();
		
		return new ResponseEntity<>(standardQrResponseDto, HttpStatus.OK);	
	}
	
	@PostMapping("/private/api/1/0/wallet/pay")
	public ResponseEntity<StandardQrResponseDto> pay(){
		
		StandardQrResponseDto standardQrResponseDto = paymentStandardQrService.pay();
		
		return new ResponseEntity<>(standardQrResponseDto, HttpStatus.OK);	
	}
	
	@PostMapping("/private/api/1/0/wallet/cancel/pay")
	public ResponseEntity<StandardQrResponseDto> cancelPay(){
		
		StandardQrResponseDto standardQrResponseDto = paymentStandardQrService.cancelPay();
		
		return new ResponseEntity<>(standardQrResponseDto, HttpStatus.OK);
		
	}
}
