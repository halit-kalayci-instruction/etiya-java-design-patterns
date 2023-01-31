package behavioral.template;

public class Main {
    public static void main(String[] args) {
        Game football = new Football();
        Game basketball = new Basketball();

     /* football.initialize();
        football.start();
        football.end();

        basketball.initialize();
        basketball.start();
        basketball.end(); */
        football.play();
        basketball.play();
        // 14.05
    }
}
