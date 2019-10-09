package com.example.demo.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.demo.dto.CardListResponseDto;
import com.example.demo.dto.UserIdentificationDto;
import com.example.demo.dumy.CardListDumy;
import com.example.demo.service.CardListService;

@Service
public class CardListServiceImpl implements CardListService {
	
	@Override
	public CardListResponseDto getPrivateCardsList() {
		
		CardListResponseDto cardListResponseDto = null;
		CardListDumy cardListDumy = new CardListDumy();
		
		cardListResponseDto = cardListDumy.dataCardListDumy();
		
		return cardListResponseDto;
	}

	@Override
	public CardListResponseDto getPublicCardsList(UserIdentificationDto userIdentificationDto) {
		
		CardListResponseDto cardListResponseDto = null;
		CardListDumy dataService = new CardListDumy();
		
		cardListResponseDto = dataService.dataCardListDumy();
		
		return cardListResponseDto;
	}
}
