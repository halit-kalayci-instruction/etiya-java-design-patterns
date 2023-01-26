package structural.facade.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log() {
        System.out.println("Database logged.");
    }
}
