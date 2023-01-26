package structural.facade.services;

import structural.facade.authorization.IAuthorization;
import structural.facade.caching.ICaching;
import structural.facade.facades.CrossCuttingConcernsFacade;
import structural.facade.logging.ILogger;

public class ProductService implements IProductService{

    CrossCuttingConcernsFacade crossCuttingConcernsFacade;

    public ProductService(CrossCuttingConcernsFacade crossCuttingConcernsFacade) {
        this.crossCuttingConcernsFacade = crossCuttingConcernsFacade;
    }

    @Override
    public void save() {
        // authorization
        // caching
        // logging
        crossCuttingConcernsFacade.authorization.authorize();
        crossCuttingConcernsFacade.caching.cache();
        crossCuttingConcernsFacade.logger.log();
        System.out.println("Product saved");
    }
}
