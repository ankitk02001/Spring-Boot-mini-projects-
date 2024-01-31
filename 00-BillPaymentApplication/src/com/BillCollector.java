package com;

public class BillCollector {

	private Bill bill;


	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
public void collectPayment() {
		int pay = bill.pay(344.45);
		if(pay>=1) {
			System.out.println("payment By CC");
		}
	}
}
