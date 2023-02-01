package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());
        if(context.getState().toString() == "Start State"){
            System.out.println("Çalan müzik: " + " The Dragonborn Comes");
        }
        EndState endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
