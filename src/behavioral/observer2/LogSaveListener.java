package behavioral.observer2;

import java.io.File;

public class LogSaveListener implements EventListener{
    @Override
    public void update(File file) {
        System.out.println("Dosya save işlemi loglandı: file.txt");
    }
}
