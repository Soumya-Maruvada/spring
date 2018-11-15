package com.cg.spring;

public class CurrencyConverterImpl implements CurrencyConverter {
	
	// ExchangeService variable
	private ExchangeService exchangeService;
	
	// Set and Get
	
	public void setExchangeService(ExchangeService exchangeService) {
		System.out.println("setExchangeService()");
		this.exchangeService = exchangeService;
	}

	public ExchangeService getExchangeService(){
		System.out.println("getExchangeService()");
		return exchangeService;
	}
	
	// Default Constructor
	public CurrencyConverterImpl() {
		System.out.println("CurrencyConverterImpl()");
	}

	
	//Implimentation Method
	public double dollersToRupees(double dollars) {
		System.out.println("dollersToRupees()");
		return dollars*exchangeService.getExchangeRate();
	}
}
