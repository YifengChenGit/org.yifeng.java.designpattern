package factory.abstractfactory;

import factory.abstractfactory.factories.AdultFoodFactory;
import factory.abstractfactory.factories.ChildFoodFactory;
import factory.abstractfactory.factories.FoodFactory;

public class App {

	public static void main(String[] args) {
		
		FoodFactory childFoodFactory = new ChildFoodFactory();
		childFoodFactory.prepareBreakfast().eat();
		childFoodFactory.prepareLunch().eat();
		childFoodFactory.prepareDinner().eat();
		
		FoodFactory adultFoodFactory = new AdultFoodFactory();
		adultFoodFactory.prepareBreakfast().eat();
		adultFoodFactory.prepareLunch().eat();
		adultFoodFactory.prepareDinner().eat();
	}
}
