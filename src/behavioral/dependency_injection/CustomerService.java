package behavioral.dependency_injection;

public class CustomerService implements ICustomerService{
    private ILogger logger;

    public CustomerService(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        logger.log();
        System.out.println("Customer added");
    }
}
