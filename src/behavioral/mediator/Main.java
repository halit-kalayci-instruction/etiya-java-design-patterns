package behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        User user = new User("Halit");
        User user1 = new User("İrem");

        user.sendMessage(user1, "Merhaba");
        user1.sendMessage(user, "Selamlar");
    }
}
