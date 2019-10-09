package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardListUserInfoResponseDto {

	@SerializedName("nombreCliente")
	@Expose
	@JsonProperty("nombreCliente")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	
}
