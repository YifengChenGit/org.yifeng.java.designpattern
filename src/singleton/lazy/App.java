package singleton.lazy;

public class App {

	public static void main(String[] args) {
		
		Singleton.getInstance().print();
		Singleton.getInstance().print();
	}
}
