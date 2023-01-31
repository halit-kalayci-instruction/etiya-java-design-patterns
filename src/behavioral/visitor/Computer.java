package behavioral.visitor;

public class Computer implements ComputerPart{
    ComputerPart[] computerParts;

    public Computer() {
        computerParts = new ComputerPart[] { new Keyboard(), new Monitor(), new Mouse()};
    }

    @Override
    public void accept(ComputerPartVisitor visitor) {
        for(ComputerPart part:computerParts){
            part.accept(visitor);
        }
        visitor.visit(this);
    }
}
