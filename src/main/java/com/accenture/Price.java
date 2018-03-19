package com.accenture;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Price {
	
	private double amount;
	private String currency;
	private String timestamp;
	
	
	
	public Price(double amount, String currency) {
		
		this.amount = amount;
		this.currency = currency;
		
		LocalDateTime dateTime = LocalDateTime.now();
		timestamp = dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
	}
	
	
	public double getAmount() {
		return amount;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	

}
