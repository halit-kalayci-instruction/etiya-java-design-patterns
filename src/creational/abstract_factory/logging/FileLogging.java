package creational.abstract_factory.logging;

public class FileLogging extends Logging{
    @Override
    public void log() {
        System.out.println("File'a loglandı..");
    }
}
