package creational.factory.factories;

import creational.factory.logging.DatabaseLogger;
import creational.factory.logging.FileLogger;
import creational.factory.logging.ILogger;

public class LoggerFactory {
    public ILogger createLogger(){
        // Üretilecek objeye karar ver..
        // Business Logic
        return new FileLogger();
    }
}
