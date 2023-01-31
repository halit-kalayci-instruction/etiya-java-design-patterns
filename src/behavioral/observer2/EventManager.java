package behavioral.observer2;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class EventManager {
    List<EventListener> subscribers = new ArrayList<>();

    public void subscribe(EventListener eventListener){
        subscribers.add(eventListener);
    }

    public void notify(File file){
        for(EventListener subscriber:subscribers){
            subscriber.update(file);
        }
    }
}
