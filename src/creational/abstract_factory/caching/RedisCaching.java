package creational.abstract_factory.caching;

public class RedisCaching extends Caching{
    @Override
    public void cache() {
        System.out.println("Redis'e cachelendi..");
    }
}
