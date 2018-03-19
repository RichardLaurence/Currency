package com.accenture;


/**
 * @author richard.laurence
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Price Fetcher" );
        
        Connector[] connectors = new Connector[3];
        
        connectors[0] = new CoinbaseConnector();
        connectors[1] = new CoinmarketCapConnector();
        connectors[2] = new KrakenConnector();
        
        
        CurrencyPair currencyPair = new CurrencyPair("BTC", "GBP");
          
        //CoinbaseConnector connector = new CoinbaseConnector();
        
        ConsoleOutput output = new ConsoleOutput();
        
        for (Connector connector : connectors) {
            
            Price price = connector.requestCurrencyPair(currencyPair);
            
            //System.out.println(price.getAmount());
            connector.monitorRequests();
            //ConsoleOutput output = new ConsoleOutput();
            output.print(price);
        }      
    }
    
}
