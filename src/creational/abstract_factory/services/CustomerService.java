package creational.abstract_factory.services;

import creational.abstract_factory.caching.Caching;
import creational.abstract_factory.factories.CrossCuttingConcernFactory;
import creational.abstract_factory.logging.Logging;

public class CustomerService implements ICustomerService{

    private Logging logging;
    private Caching caching;

    public CustomerService(CrossCuttingConcernFactory crossCuttingConcernFactory) {
        logging = crossCuttingConcernFactory.createLogging();
        caching = crossCuttingConcernFactory.createCaching();
    }

    @Override
    public void add() {
        logging.log();
        caching.cache();
        System.out.println("Eklendi.");
    }
}
