package factory.abstractfactory.factories;

import factory.abstractfactory.breakfast.Breakfast;
import factory.abstractfactory.dinner.Dinner;
import factory.abstractfactory.lunch.Lunch;

public interface FoodFactory {

	Breakfast prepareBreakfast();
	
	Lunch prepareLunch();
	
	Dinner prepareDinner();
}
