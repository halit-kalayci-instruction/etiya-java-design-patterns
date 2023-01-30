package behavioral.null_object2;

import behavioral.null_object2.models.Customer;
import behavioral.null_object2.repositories.CustomerRepository;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = CustomerRepository.getCustomer("Halit");
        Customer customer2 = CustomerRepository.getCustomer("İrem");
        Customer customer3 = CustomerRepository.getCustomer("Deneme");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());
    }
}
