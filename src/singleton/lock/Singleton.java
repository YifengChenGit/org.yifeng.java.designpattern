package singleton.lock;

public class Singleton {

	private volatile static Singleton instance;
	
	private Singleton() {

	}
	
	public static Singleton getInstance() {
		
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
	public void print() {
		System.out.println("Singleton");
	}
}
