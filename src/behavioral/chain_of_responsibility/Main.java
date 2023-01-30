package behavioral.chain_of_responsibility;

import behavioral.chain_of_responsibility.logging.AbstractLogger;
import behavioral.chain_of_responsibility.patterns.LoggerChain;

public class Main {
    public static void main(String[] args) {
        AbstractLogger logger = LoggerChain.getChainOfLoggers();
        logger.logMessage("Merhaba!");
    }
}
