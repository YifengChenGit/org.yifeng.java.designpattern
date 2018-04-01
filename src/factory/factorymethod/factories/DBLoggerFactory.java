package factory.factorymethod.factories;

import factory.factorymethod.loggers.DBLogger;
import factory.factorymethod.loggers.Logger;

public class DBLoggerFactory implements LoggerFactory {

	@Override
	public Logger createLogger() {
		return new DBLogger();
	}
}
