package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int number;
    private List<Observer> subscribers = new ArrayList<>();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        // dinleyicilerin hepsini uyar..
        notifyAllSubscribers();
    }

    public void notifyAllSubscribers(){
        for(Observer observer: subscribers){
            observer.update();
        }
    }

    public void subscribe(Observer observer){
        subscribers.add(observer);
    }

}
