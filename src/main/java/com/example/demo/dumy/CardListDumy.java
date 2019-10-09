package com.example.demo.dumy;

import com.example.demo.dto.CardBasicInfoResponseDto;
import com.example.demo.dto.CardListInfoResponseDto;
import com.example.demo.dto.CardListResponseDto;
import com.example.demo.dto.CardListUserInfoResponseDto;

public class CardListDumy {

	public CardListResponseDto dataCardListDumy() {

		CardBasicInfoResponseDto[] cardBasicInfoResponseDtos = new CardBasicInfoResponseDto[1];
		
		cardBasicInfoResponseDtos[0] = new CardBasicInfoResponseDto();
		cardBasicInfoResponseDtos[0].setCardNumber("5306917000053467");
		cardBasicInfoResponseDtos[0].setCardType("DEBITO");
		cardBasicInfoResponseDtos[0].setFranchise("MASTERCARD - MASTERDEBIT");
		cardBasicInfoResponseDtos[0].setCardTypeCode("004");
		cardBasicInfoResponseDtos[0].setExpiryDate("202411");
		cardBasicInfoResponseDtos[0].setAvailableBalance(Double.valueOf("98000000.0000"));
		cardBasicInfoResponseDtos[0].setAccountType("CORRIENTES");

//		cardBasicInfoResponseDtos[1] = new CardBasicInfoResponseDto();
//		cardBasicInfoResponseDtos[1].setCardNumber("6016607126363721");
//		cardBasicInfoResponseDtos[1].setCardType("DEBITO");
//		cardBasicInfoResponseDtos[1].setFranchise("MASTERCARD - MAESTRO");
//		cardBasicInfoResponseDtos[1].setCardTypeCode("035");
//		cardBasicInfoResponseDtos[1].setExpiryDate("202411");
//		cardBasicInfoResponseDtos[1].setAvailableBalance(Double.valueOf("98000000.0000"));
//		cardBasicInfoResponseDtos[1].setAccountType("AHORRO");
//		
//		cardBasicInfoResponseDtos[2] = new CardBasicInfoResponseDto();
//		cardBasicInfoResponseDtos[2].setCardNumber("0377813075624560");
//		cardBasicInfoResponseDtos[2].setCardType("CREDITO");
//		cardBasicInfoResponseDtos[2].setFranchise("AMERICAN EXPRESS BLU");
//		cardBasicInfoResponseDtos[2].setCardTypeCode("000");
//		cardBasicInfoResponseDtos[2].setExpiryDate("202211");
//		cardBasicInfoResponseDtos[2].setAvailableBalance(Double.valueOf("3000000.0000"));
//		cardBasicInfoResponseDtos[2].setAccountType("");
//		
//		cardBasicInfoResponseDtos[3] = new CardBasicInfoResponseDto();
//		cardBasicInfoResponseDtos[3].setCardNumber("4513070542036723");
//		cardBasicInfoResponseDtos[3].setCardType("CREDITO");
//		cardBasicInfoResponseDtos[3].setFranchise("VISA CLÁSICA");
//		cardBasicInfoResponseDtos[3].setCardTypeCode("000");
//		cardBasicInfoResponseDtos[3].setExpiryDate("202211");
//		cardBasicInfoResponseDtos[3].setAvailableBalance(Double.valueOf("3000000.0000"));
//		cardBasicInfoResponseDtos[3].setAccountType("");
//		
//		cardBasicInfoResponseDtos[4] = new CardBasicInfoResponseDto();
//		cardBasicInfoResponseDtos[4].setCardNumber("5303710205124032");
//		cardBasicInfoResponseDtos[4].setCardType("CREDITO");
//		cardBasicInfoResponseDtos[4].setFranchise("MASTER CARD CLÁSICA");
//		cardBasicInfoResponseDtos[4].setCardTypeCode("000");
//		cardBasicInfoResponseDtos[4].setExpiryDate("202411");
//		cardBasicInfoResponseDtos[4].setAvailableBalance(Double.valueOf("3000000.0000"));
//		cardBasicInfoResponseDtos[4].setAccountType("");
		
		
		CardListInfoResponseDto cardListInfoResponseDto = new CardListInfoResponseDto();
		cardListInfoResponseDto.setCardBasicInfo(cardBasicInfoResponseDtos);

		CardListUserInfoResponseDto cardListUserInfoResponseDto = new CardListUserInfoResponseDto();
		cardListUserInfoResponseDto.setUserName("LUIS ALBERTO POSADA");
		
		CardListResponseDto cardListResponseDto = new CardListResponseDto();
		cardListResponseDto.setCardsInfo(cardListInfoResponseDto);
		cardListResponseDto.setUserInfo(cardListUserInfoResponseDto);

		return cardListResponseDto;

	}

}