package p1;

public class Billcollector {

	private IPayment payment;

	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	public Billcollector(IPayment payment) {
		super();
		this.payment = payment;
	}
	public void billCollector(Double amount) {
		String pay = payment.pay(amount);
		System.out.println(pay);
		System.out.println(payment.getClass().getName());
	}
	
}
