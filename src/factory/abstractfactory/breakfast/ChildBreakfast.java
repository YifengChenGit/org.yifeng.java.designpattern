package factory.abstractfactory.breakfast;

public class ChildBreakfast implements Breakfast {

	@Override
	public void eat() {
		System.out.println("Child Breakfast");
	}
}
