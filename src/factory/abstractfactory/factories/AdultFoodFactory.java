package factory.abstractfactory.factories;

import factory.abstractfactory.breakfast.AdultBreakfast;
import factory.abstractfactory.breakfast.Breakfast;
import factory.abstractfactory.dinner.AdultDinner;
import factory.abstractfactory.dinner.Dinner;
import factory.abstractfactory.lunch.AdultLunch;
import factory.abstractfactory.lunch.Lunch;

public class AdultFoodFactory implements FoodFactory {

	@Override
	public Breakfast prepareBreakfast() {
		return new AdultBreakfast();
	}

	@Override
	public Lunch prepareLunch() {
		return new AdultLunch();
	}

	@Override
	public Dinner prepareDinner() {
		return new AdultDinner();
	}
}
