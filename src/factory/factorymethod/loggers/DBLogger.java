package factory.factorymethod.loggers;

public class DBLogger implements Logger {

	@Override
	public void log() {
		System.out.println("DB logger");
	}
}
