package behavioral.null_object2.repositories;

import behavioral.null_object2.models.Customer;
import behavioral.null_object2.models.NullCustomer;
import behavioral.null_object2.models.RealCustomer;

public class CustomerRepository {
    public static final String[] customers = {"Halit","İrem","Erdi","Burak","Berkay"};

    public static Customer getCustomer(String name){
        for(int i=0; i<customers.length; i++){
            if(customers[i].equalsIgnoreCase(name)){
                RealCustomer realCustomer = new RealCustomer();
                realCustomer.name = name;
                return realCustomer;
            }
        }
        //return null;
        return new NullCustomer();
    }
}
