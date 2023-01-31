package behavioral.mediator;

import java.util.Date;

public class ChatRoom {
    public static void showMessage(User user, User to, String message){
        System.out.println(new Date().toString() + " [" + user.name + "] : " + message + " - send to: " + to.name);
    }
}
