package factory.abstractfactory.factories;

import factory.abstractfactory.breakfast.Breakfast;
import factory.abstractfactory.breakfast.ChildBreakfast;
import factory.abstractfactory.dinner.ChildDinner;
import factory.abstractfactory.dinner.Dinner;
import factory.abstractfactory.lunch.ChildLunch;
import factory.abstractfactory.lunch.Lunch;

public class ChildFoodFactory implements FoodFactory {

	@Override
	public Breakfast prepareBreakfast() {
		return new ChildBreakfast();
	}

	@Override
	public Lunch prepareLunch() {
		return new ChildLunch();
	}

	@Override
	public Dinner prepareDinner() {
		return new ChildDinner();
	}
}
