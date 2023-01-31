package behavioral.observer2;

import java.io.File;

public class LogOpenListener implements EventListener{
    @Override
    public void update(File file) {
        System.out.println("Dosya işlemi loglandı: " + file.getName());
    }
}
