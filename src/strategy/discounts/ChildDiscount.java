package strategy.discounts;

public class ChildDiscount implements Discount {

	@Override
	public double applyDiscount(double price) {
		return price - 10;
	}
}
