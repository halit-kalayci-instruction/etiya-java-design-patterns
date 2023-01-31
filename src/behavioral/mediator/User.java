package behavioral.mediator;

public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(User user, String message){
        ChatRoom.showMessage(this, user, message);
    }
}
