package behavioral.observer2;

public class Main {
    public static void main(String[] args) throws Exception {
        Editor editor = new Editor();
        editor.eventManager.subscribe(new LogOpenListener());
        editor.eventManager.subscribe(new LogSaveListener());
        editor.eventManager.subscribe(new EmailNotificationListener());


        editor.openFile("C:\\Users\\klyyc\\Desktop\\Projects\\Java\\design_patterns_etiya\\src\\behavioral\\observer2\\file.txt");
        editor.saveFile();
    }
}
