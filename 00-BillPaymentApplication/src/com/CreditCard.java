package com;

public class CreditCard implements Bill {

	@Override
	public int pay(Double amount) {
		System.err.println("Payment Sucess through Creditcard");
		return 1;
	}

}
