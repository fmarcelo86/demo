package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CardBasicInfoResponseDto {

	@SerializedName("idTarjeta")
	@Expose
	@JsonProperty("idTarjeta")
    private String cardId;

	@SerializedName("estadoTarjeta")
	@Expose
	@JsonProperty("estadoTarjeta")
    private String cardStatus;

	@SerializedName("arteTarjeta")
	@Expose
	@JsonProperty("arteTarjeta")
    private String cardImage;

	@SerializedName("numeroTarjeta")
	@Expose
	@JsonProperty("numeroTarjeta")
    private String cardNumber;

	@SerializedName("tipoTarjeta")
	@Expose
	@JsonProperty("tipoTarjeta")
    private String cardType;

	@SerializedName("tipoCuenta")
	@Expose
	@JsonProperty("tipoCuenta")
    private String accountType;

	@SerializedName("saldoDisponible")
	@Expose
	@JsonProperty("saldoDisponible")
    private Double availableBalance;

	@SerializedName("franquicia")
	@Expose
	@JsonProperty("franquicia")
    private String franchise;

	@SerializedName("codigoClaseTarjeta")
	@Expose
	@JsonProperty("codigoClaseTarjeta")
    private String cardTypeCode;

	@SerializedName("fechaDeVencimiento")
	@Expose
	@JsonProperty("fechaDeVencimiento")
    private String expiryDate;

	@SerializedName("preferida")
	@Expose
	@JsonProperty("preferida")
    private String preferred;

	@SerializedName("oculta")
	@Expose
	@JsonProperty("oculta")
    private Boolean hidden;

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public String getCardStatus() {
		return cardStatus;
	}

	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardImage() {
		return cardImage;
	}

	public void setCardImage(String cardImage) {
		this.cardImage = cardImage;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardType() {
		return cardType;
	}

	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public Double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(Double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public String getFranchise() {
		return franchise;
	}

	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}

	public String getCardTypeCode() {
		return cardTypeCode;
	}

	public void setCardTypeCode(String cardTypeCode) {
		this.cardTypeCode = cardTypeCode;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getPreferred() {
		return preferred;
	}

	public void setPreferred(String preferred) {
		this.preferred = preferred;
	}

	public Boolean getHidden() {
		return hidden;
	}

	public void setHidden(Boolean hidden) {
		this.hidden = hidden;
	}
	
	
}
