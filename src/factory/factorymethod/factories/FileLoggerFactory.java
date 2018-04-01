package factory.factorymethod.factories;

import factory.factorymethod.loggers.FileLogger;
import factory.factorymethod.loggers.Logger;

public class FileLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new FileLogger();
	}
}
