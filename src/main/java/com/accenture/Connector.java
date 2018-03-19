package com.accenture;

public abstract class Connector {

	public void monitorRequests() {
		System.out.println("This request was logged in our monitoring");
	}	
	public abstract Price requestCurrencyPair(CurrencyPair crypto);
	
	
}
