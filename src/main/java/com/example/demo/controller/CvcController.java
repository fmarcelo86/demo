package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ConsultaResponseDto;
import com.example.demo.service.CvcService;

@RestController
public class CvcController {
	
	@Autowired
	private CvcService cvcService;
	
	@PostMapping("/private/api/1/0/wallet/card/cvc")
	public ResponseEntity<ConsultaResponseDto> getCardList(){
		
		ConsultaResponseDto consultaResponseDto = cvcService.getCvc();
		
		return new ResponseEntity<>(consultaResponseDto, HttpStatus.OK);
		
	}
}
