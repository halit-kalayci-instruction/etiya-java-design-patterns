package behavioral.null_object2.models;

public class RealCustomer extends Customer{
    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean isNull() {
        return false;
    }
}
