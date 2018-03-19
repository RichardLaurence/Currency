package com.accenture;

public class ConsoleOutput {

		public void print(Price price) {
			
			if(price != null) {
			System.out.println("Coinbase gave me: " + price.getAmount()
													+ " for 1 " + price.getCurrency());
			}
			//throw new IllegalArgumentException("Price must not be null");
			return;
		}
}
