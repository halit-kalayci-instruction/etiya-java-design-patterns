package behavioral.dependency_injection;

public class Main {
    public static void main(String[] args) {
        // IoC (Spring IoC), DI Container
        ICustomerService customerService = new CustomerService(new FileLogger());
        customerService.add();
    }
}
