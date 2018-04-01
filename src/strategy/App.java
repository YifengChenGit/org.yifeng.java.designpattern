package strategy;

import strategy.discounts.ChildDiscount;
import strategy.discounts.SeniorDiscount;

public class App {

	public static void main(String[] args) {
		
		Ticket childTicket = new Ticket(100, new ChildDiscount());
		childTicket.getPriceAfterDiscount();
		
		Ticket seniorTicket = new Ticket(200, new SeniorDiscount());
		seniorTicket.getPriceAfterDiscount();
	}
}
