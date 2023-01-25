package creational.factory.logging;

import javax.xml.crypto.Data;

public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database'e loglandı..");
    }
}
