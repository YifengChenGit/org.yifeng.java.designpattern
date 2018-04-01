package factory.abstractfactory.lunch;

public class ChildLunch implements Lunch {

	@Override
	public void eat() {
		System.out.println("Child Lunch");
	}
}
