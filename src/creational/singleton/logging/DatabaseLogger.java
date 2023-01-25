package creational.singleton.logging;


import javax.xml.crypto.Data;
import java.util.logging.Logger;

public class DatabaseLogger implements ILogging{
    // Type Quantifier
    private static volatile DatabaseLogger instance;
    private String message;
    public static DatabaseLogger getInstance(String message){
        // SINGLETON PATTERN
        // Multi-Thread uyumlu değil
        // C# => lock
        // Java => synchronized
        DatabaseLogger logger = instance;
        if(logger!=null) return logger;
        synchronized (DatabaseLogger.class){
            if(instance==null)
                instance = new DatabaseLogger(message);
            return instance;
        }
    }

    public DatabaseLogger(String _message) {
        message = _message;
    }

    @Override
    public void log() {
        System.out.println("Database'e loglandı: " + message);
    }
}
