package behavioral.visitor;

public class Main {
    public static void main(String[] args)
    {
        Computer computer = new Computer();
        computer.accept(new ComputerPartGamerVisitor());

        Computer computer1 = new Computer();
        computer1.accept(new ComputerPartDisplayVisitor());

        Computer computer2 = new Computer();
        computer2.accept(new ComputerPartOfficeVisitor());
    }
}
