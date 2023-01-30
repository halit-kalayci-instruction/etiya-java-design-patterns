package behavioral.chain_of_responsibility.logging;

public abstract class AbstractLogger {

    public AbstractLogger nextLogger;
    // Chain

    public void logMessage(String message){
        log(message);

        // Chain Control
        // Zincirin son halkasında mıyım?
        if(nextLogger != null){
            nextLogger.logMessage(message);
        }
    }

    abstract void log(String message);
}
