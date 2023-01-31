package behavioral.visitor;

public class ComputerPartGamerVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Bilgisayar gaming bilgisayara yükseltildi!");
    }

    @Override
    public void visit(Keyboard keyboard) {
        keyboard.isRgb = true;
        System.out.println("Klavyeye RGB özelliği kazandırıldı.");
    }

    @Override
    public void visit(Monitor monitor) {
        // monitor.hz = 144;
        System.out.println("Monitör 144hz'e yükseltildi..");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Mouse gaming mouse'a yükseltildi..");
    }
}
