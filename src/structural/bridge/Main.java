package structural.bridge;

import structural.bridge.message_senders.EmailSender;
import structural.bridge.message_senders.SmsSender;
import structural.bridge.services.CustomerService;
import structural.bridge.services.ICustomerService;

public class Main {
    public static void main(String[] args) {
        CustomerService customerService = new CustomerService();
        customerService.messageSenderBase = new EmailSender();
        customerService.verify();

        customerService.messageSenderBase = new SmsSender();
        customerService.verify();

    }
}
