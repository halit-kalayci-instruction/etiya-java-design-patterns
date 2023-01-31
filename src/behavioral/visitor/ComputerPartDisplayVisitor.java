package behavioral.visitor;

public class ComputerPartDisplayVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Computer objesi visit edildi");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Keyboard objesi visit edildi");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitor objesi visit edildi");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse objesi visit edildi");
    }
}
