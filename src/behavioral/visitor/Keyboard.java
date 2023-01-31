package behavioral.visitor;

public class Keyboard implements ComputerPart{
    public boolean isRgb;
    @Override
    public void accept(ComputerPartVisitor visitor) {
        visitor.visit(this);
    }
}
