package com;

public class Test {
	public static void main(String[] args) {
	BillCollector cc=new BillCollector();
	cc.setBill(new CreditCard());
	cc.collectPayment();
	}
}
