package behavioral.null_object.services;

import behavioral.null_object.loggers.ILogger;

public class CustomerService implements ICustomerService{
    private ILogger logger;

    public CustomerService(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        // loglama..
        // NullPointerException

        // Null Reference check
        //if(logger != null)
            logger.log();
        System.out.println("Customer eklendi..");
    }
}
