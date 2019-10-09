package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardListResponseDto {
	
	@SerializedName("informacionBasicaClienteResponse")
	@Expose	
	@JsonProperty("informacionBasicaClienteResponse")
    private CardListUserInfoResponseDto userInfo;

	@SerializedName("informacionTarjetaResponse")
	@Expose
	@JsonProperty("informacionTarjetaResponse")
	private CardListInfoResponseDto cardsInfo;

	public CardListUserInfoResponseDto getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(CardListUserInfoResponseDto userInfo) {
		this.userInfo = userInfo;
	}

	public CardListInfoResponseDto getCardsInfo() {
		return cardsInfo;
	}

	public void setCardsInfo(CardListInfoResponseDto cardsInfo) {
		this.cardsInfo = cardsInfo;
	}

	
}
