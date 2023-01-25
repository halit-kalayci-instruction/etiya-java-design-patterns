package creational.abstract_factory.logging;

public class DatabaseLogging extends Logging{
    @Override
    public void log() {
        System.out.println("Database'e loglandı..");
    }
}
