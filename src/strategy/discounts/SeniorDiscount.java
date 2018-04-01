package strategy.discounts;

public class SeniorDiscount implements Discount {

	@Override
	public double applyDiscount(double price) {
		return price * 0.5;
	}
}
