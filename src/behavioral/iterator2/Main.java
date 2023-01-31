package behavioral.iterator2;

public class Main {
    public static void main(String[] args) {
        CustomerRepository customerRepository = new CustomerRepository();
        Iterator iterator = customerRepository.getIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.getNext());
        }
    }
}
