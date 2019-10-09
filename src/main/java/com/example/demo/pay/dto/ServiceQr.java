package com.example.demo.pay.dto;

public enum ServiceQr {
	PAY("AutorizarTransaccion"),
	ANNULAR("AnularTransaccion");

	private final String serviceName;

	ServiceQr(final String serviceName) {
		this.serviceName = serviceName;
	}
	@Override
	public String toString() {
		return serviceName;
	}
}
