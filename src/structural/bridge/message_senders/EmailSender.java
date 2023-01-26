package structural.bridge.message_senders;

public class EmailSender extends MessageSenderBase{
    @Override
    public void send() {
        System.out.println("Email yollandı.");
    }
}
