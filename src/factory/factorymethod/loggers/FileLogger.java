package factory.factorymethod.loggers;

public class FileLogger implements Logger {

	@Override
	public void log() {
		System.out.println("File logger");
	}
}
