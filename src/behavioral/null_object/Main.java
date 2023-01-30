package behavioral.null_object;

import behavioral.null_object.loggers.DatabaseLogger;
import behavioral.null_object.loggers.StubLogger;
import behavioral.null_object.services.CustomerService;
import behavioral.null_object.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new DatabaseLogger());
        customerService.add();

        ICustomerService customerService1 = new CustomerService(new StubLogger());
        customerService1.add();
    }
}
