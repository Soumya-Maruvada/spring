package com.cg.spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CurrencyConverterClient {

	public static void main(String[] args) throws Exception {
		ApplicationContext factory = new ClassPathXmlApplicationContext("currencyconverter.xml");
		CurrencyConverter curr = 
					(CurrencyConverter) factory.getBean("currencyConverter");
		double rupees = curr.dollersToRupees(50.0);
		System.out.println("50 $ is" + rupees + "Rs.");

	}

}
