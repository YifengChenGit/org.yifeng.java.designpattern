package factory.factorymethod;

import factory.factorymethod.factories.DBLoggerFactory;
import factory.factorymethod.factories.FileLoggerFactory;
import factory.factorymethod.factories.LoggerFactory;

public class App {

	public static void main(String[] args) {
		
		LoggerFactory dbLoggerFactory = new DBLoggerFactory();
		dbLoggerFactory.createLogger().log();
		
		LoggerFactory fileLoggerFactory = new FileLoggerFactory();
		fileLoggerFactory.createLogger().log();
	}
}
