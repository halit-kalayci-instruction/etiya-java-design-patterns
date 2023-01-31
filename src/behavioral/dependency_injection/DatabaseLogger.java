package behavioral.dependency_injection;

public class DatabaseLogger implements ILogger {
    @Override
    public void log() {
        System.out.println("Database'e loglandı.");
    }
}
