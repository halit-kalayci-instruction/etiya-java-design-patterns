package creational.abstract_factory;

import creational.abstract_factory.caching.RedisCaching;
import creational.abstract_factory.factories.Factory1;
import creational.abstract_factory.factories.Factory2;
import creational.abstract_factory.logging.DatabaseLogging;
import creational.abstract_factory.services.CustomerService;
import creational.abstract_factory.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        ICustomerService customerService = new CustomerService(new Factory1());
        customerService.add();

        System.out.println("****************");


        ICustomerService customerService2 = new CustomerService(new Factory2());
        customerService2.add();
    }
}
