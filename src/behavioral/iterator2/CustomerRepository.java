package behavioral.iterator2;

public class CustomerRepository implements ICustomerRepository{

    public String customers[] = {"Halit","İrem","Aysu","Doruk"};

    @Override
    public Iterator getIterator() {
        return new CustomerIterator(customers);
    }
}
