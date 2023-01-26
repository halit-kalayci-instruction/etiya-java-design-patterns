package structural.facade;

import structural.facade.authorization.Authorization;
import structural.facade.caching.RedisCaching;
import structural.facade.facades.CrossCuttingConcernsFacade;
import structural.facade.logging.DatabaseLogger;
import structural.facade.services.IProductService;
import structural.facade.services.ProductService;

public class Main {

    public static void main(String[] args) {
        IProductService productService = new ProductService(new CrossCuttingConcernsFacade());
        productService.save();
    }
}
