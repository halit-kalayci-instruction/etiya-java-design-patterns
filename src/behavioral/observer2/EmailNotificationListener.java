package behavioral.observer2;

import java.io.File;

public class EmailNotificationListener implements EventListener{
    @Override
    public void update(File file) {
        System.out.println("Dosyadaki değişiklik email ile notify edildi: " + file.getName());
    }
}
