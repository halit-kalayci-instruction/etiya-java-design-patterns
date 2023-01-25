package creational.factory;

import creational.factory.factories.LoggerFactory;
import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.FileLogger;
import creational.factory.logging.ILogger;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        LoggerFactory factory = new LoggerFactory();

        ILogger logger = factory.createLogger();
        logger.log();

        ILogger logger1 = factory.createLogger();
        logger1.log();

        ILogger logger2 = factory.createLogger();
        logger2.log();

        ILogger logger3 = factory.createLogger();
        logger3.log();

        ILogger logger4 = factory.createLogger();
        logger4.log();

        ILogger logger5 = factory.createLogger();
        logger5.log();

    }
}
