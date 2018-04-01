package singleton.idh;

public class Singleton {

	private Singleton() {
		
	}
	
	private static final class InitializationDemandHolder {
		private static final Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance() {
		return InitializationDemandHolder.instance;
	}
	
	public void print() {
		System.out.println("Singleton");
	}
}
