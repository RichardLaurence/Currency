package com.accenture;

public class CurrencyPair {
	
	private String cryptoCurrency;
	private String currency;
	
	
	public CurrencyPair(String cryptoCurrency, String currency) {
		this.cryptoCurrency = cryptoCurrency;
		this.currency = currency;
	}
	
	public String getCryptoCurrency() {
		return cryptoCurrency;
	}
	
	public String getCurrency() {
		return currency;
	}
	

}
