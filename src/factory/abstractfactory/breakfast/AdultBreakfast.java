package factory.abstractfactory.breakfast;

public class AdultBreakfast implements Breakfast {

	@Override
	public void eat() {
		System.out.println("Adult Breakfast");
	}
}
