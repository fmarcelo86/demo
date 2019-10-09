package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.CardListResponseDto;
import com.example.demo.dto.UserIdentificationDto;
import com.example.demo.service.CardListService;

@RestController
public class CardListController {
	
	@Autowired
	private CardListService cardListService;
	
	@PostMapping("/private/api/1/0/wallet/card/list")
	public ResponseEntity<CardListResponseDto> getPrivateCardsList(){
		
		CardListResponseDto cardListResponseDto = cardListService.getPrivateCardsList();
		
		return new ResponseEntity<>(cardListResponseDto, HttpStatus.OK);
		
	}
	
	@PostMapping("/public/api/1/0/wallet/card/list")
	public ResponseEntity<CardListResponseDto> getPublicCardsList(@RequestBody UserIdentificationDto userIdentificationDto){
		
		CardListResponseDto cardListResponseDto = cardListService.getPublicCardsList(userIdentificationDto);
		
		return new ResponseEntity<>(cardListResponseDto, HttpStatus.OK);
		
	}
}
