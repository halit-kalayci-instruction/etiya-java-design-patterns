package structural.adapter.services;

import structural.adapter.logging.ILogger;

public class CustomerService implements ICustomerService{
    private ILogger logger;

    public CustomerService(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        logger.log();
        System.out.println("Customer eklendi.");
    }
}
