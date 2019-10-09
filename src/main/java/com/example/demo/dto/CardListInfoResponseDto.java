package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardListInfoResponseDto {
	
	@SerializedName("informacionBasicaResponse")
	@Expose	
	@JsonProperty("informacionBasicaResponse")
	private CardBasicInfoResponseDto[] cardBasicInfo;

	public CardBasicInfoResponseDto[] getCardBasicInfo() {
		return cardBasicInfo;
	}

	public void setCardBasicInfo(CardBasicInfoResponseDto[] cardBasicInfo) {
		this.cardBasicInfo = cardBasicInfo;
	}

	
}
