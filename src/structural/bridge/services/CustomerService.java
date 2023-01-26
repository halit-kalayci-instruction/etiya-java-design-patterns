package structural.bridge.services;

import structural.bridge.message_senders.MessageSenderBase;

public class CustomerService implements ICustomerService{
    public MessageSenderBase messageSenderBase;



    @Override
    public void verify() {
        messageSenderBase.send();
    }
}
