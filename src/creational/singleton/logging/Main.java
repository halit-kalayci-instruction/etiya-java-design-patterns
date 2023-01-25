package creational.singleton.logging;

import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {
        /* ILogging logger = new DatabaseLogger("Logger 1");
        logger.log();

        ILogging logger1 = new DatabaseLogger("Logger 2");
        logger1.log();


        ILogging logger2 = new DatabaseLogger("Logger 3");
        logger2.log(); */

        // Single-Thread
        /* ILogging logger = DatabaseLogger.getInstance("Logger 1");
        logger.log();

        ILogging logger1 = DatabaseLogger.getInstance("Logger 2");
        logger1.log();

        ILogging logger2 = DatabaseLogger.getInstance("Logger 3");
        logger2.log(); */
        //
        // Multi-Thread
           Thread thread1 = new Thread(new LoggerThread1());
           Thread thread2 = new Thread(new LoggerThread2());
           thread1.start();
           thread2.start();
        //
    }

    static class LoggerThread1 implements Runnable{

        @Override
        public void run() {
            ILogging logging = DatabaseLogger.getInstance("Logger 1");
            logging.log();
        }
    }
    static class LoggerThread2 implements Runnable {

        @Override
        public void run() {
            ILogging logging = DatabaseLogger.getInstance("Logger 2");
            logging.log();
        }
    }

}
