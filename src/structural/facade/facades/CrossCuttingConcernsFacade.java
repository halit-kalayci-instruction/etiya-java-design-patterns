package structural.facade.facades;

import structural.facade.authorization.Authorization;
import structural.facade.authorization.IAuthorization;
import structural.facade.caching.ICaching;
import structural.facade.caching.RedisCaching;
import structural.facade.logging.DatabaseLogger;
import structural.facade.logging.ILogger;

public class CrossCuttingConcernsFacade {
    public ILogger logger;
    public ICaching caching;
    public IAuthorization authorization;

    public CrossCuttingConcernsFacade() {
        // IoC, DI Container
        this.logger = new DatabaseLogger();
        this.caching = new RedisCaching();
        this.authorization = new Authorization();
    }
}
