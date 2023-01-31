package behavioral.observer2;

import java.io.File;

public class Editor {
    private File file;
    public EventManager eventManager;

    public Editor() {
        eventManager = new EventManager();
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        eventManager.notify(file);
    }

    public void saveFile() throws Exception{
        if(this.file != null){
            eventManager.notify(file);
        }else{
            throw new Exception("Please open a file first..");
        }
    }
}
