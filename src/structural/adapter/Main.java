package structural.adapter;

import structural.adapter.adapters.VatanSMSAdapter;
import structural.adapter.logging.DatabaseLogger;
import structural.adapter.logging.FileLogger;
import structural.adapter.services.CustomerService;
import structural.adapter.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new FileLogger());
        customerService.add();

        System.out.println("**************");

        ICustomerService customerService1 = new CustomerService(new DatabaseLogger());
        customerService1.add();

        System.out.println("**************");


        ICustomerService customerService2 = new CustomerService(new VatanSMSAdapter());
        customerService2.add();
    }
}
