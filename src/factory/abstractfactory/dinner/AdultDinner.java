package factory.abstractfactory.dinner;

public class AdultDinner implements Dinner {

	@Override
	public void eat() {
		System.out.println("Adult Dinner");
	}
}
