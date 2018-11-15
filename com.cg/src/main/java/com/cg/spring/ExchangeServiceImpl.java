package com.cg.spring;

public class ExchangeServiceImpl implements ExchangeService {
	private double exchangeRate;

	// constructor
	public ExchangeServiceImpl(double exchangeRate) {
		System.out.println("ExchangeServiceImpl()");
		this.exchangeRate = exchangeRate;
	}

	public double getExchangeRate() {
		System.out.println("getExchangerate()");
		return exchangeRate;
	}

}
