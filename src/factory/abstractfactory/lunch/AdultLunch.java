package factory.abstractfactory.lunch;

public class AdultLunch implements Lunch {

	@Override
	public void eat() {
		System.out.println("Adult Lunch");
	}
}
