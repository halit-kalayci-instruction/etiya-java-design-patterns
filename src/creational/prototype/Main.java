package creational.prototype;

public class Main {
    public static void main(String[] args) {
       /* Customer customer1 = new Customer();
        customer1.id = 1;
        customer1.firstName = "Halit";
        customer1.lastName = "Kalaycı";
        customer1.customerNo="abc1";

        Customer customer2 = new Customer();
        customer2.id = customer1.id;;
        customer2.firstName = customer1.firstName;
        customer2.lastName = customer1.lastName;
        customer2.customerNo = customer1.customerNo; */

        Customer customer1 = new Customer();
        customer1.id = 1;
        customer1.firstName = "Halit";
        customer1.lastName = "Kalaycı";
        customer1.customerNo="abc1";

        Customer customer2 = (Customer) customer1.clone();
        System.out.println(customer2.customerNo);
    }
}
