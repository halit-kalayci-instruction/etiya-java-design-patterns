package creational.prototype;

public class Customer extends Person{
    public String customerNo;
    private String nationalityId;

    public Customer(){}

    public Customer(Customer customer){
        super(customer);
        if(customer!=null){
            customerNo = customer.customerNo;
            nationalityId = customer.nationalityId;
        }
    }

    @Override
    public Person clone() {
        return new Customer(this);
    }
}
