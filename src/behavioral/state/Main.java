package behavioral.state;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        EndState endState = new EndState();
        endState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
