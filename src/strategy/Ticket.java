package strategy;

import strategy.discounts.Discount;

public class Ticket {

	private double price;
	private Discount discount;

	public Ticket(double price, Discount discount) {
		this.price = price;
		this.discount = discount;
	}
	
	public void getPriceAfterDiscount() {
		System.out.println(discount.applyDiscount(price));
	}
}
