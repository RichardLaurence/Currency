package com.accenture;

import java.io.IOException;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import com.coinbase.api.Coinbase;
import com.coinbase.api.CoinbaseBuilder;
import com.coinbase.api.exception.CoinbaseException;

public class CoinbaseConnector extends Connector {

	
	public Price requestCurrencyPair(CurrencyPair crypto) {
		String token = "the_oauth_token";
		Coinbase cb = new CoinbaseBuilder()
		                      .withAccessToken(token)
		                      .build();

		Price price = null;
		
		try {
			Money spotPrice = cb.getSpotPrice(CurrencyUnit.of(crypto.getCurrency()));
			double amount = spotPrice.getAmount().doubleValue();
			
			price = new Price(amount, "BTC");
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (CoinbaseException e) {
			
			e.printStackTrace();
		}
		
		
		//System.out.println(crypto.getCryptoCurrency());
		System.out.println(crypto.getCurrency());
		
		//Price price = new Price(10, crypto.getCryptoCurrency());
		
		
		return price;
		
	}
	
}
