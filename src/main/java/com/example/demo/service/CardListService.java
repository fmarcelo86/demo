package com.example.demo.service;

import com.example.demo.dto.CardListResponseDto;
import com.example.demo.dto.UserIdentificationDto;

public interface CardListService {

	public CardListResponseDto getPrivateCardsList();
	
	public CardListResponseDto getPublicCardsList(UserIdentificationDto userIdentificationDto);
}
