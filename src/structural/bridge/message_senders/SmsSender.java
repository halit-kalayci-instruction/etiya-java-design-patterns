package structural.bridge.message_senders;

public class SmsSender extends MessageSenderBase{
    @Override
    public void send() {
        System.out.println("SMS yollandı.");
    }
}
