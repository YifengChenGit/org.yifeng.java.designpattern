package factory.abstractfactory.dinner;

public class ChildDinner implements Dinner {

	@Override
	public void eat() {
		System.out.println("Child Dinner");
	}
}
