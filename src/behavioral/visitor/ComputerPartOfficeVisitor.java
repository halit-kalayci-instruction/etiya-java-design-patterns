package behavioral.visitor;

public class ComputerPartOfficeVisitor implements ComputerPartVisitor{
    @Override
    public void visit(Computer computer) {
        System.out.println("Bilgisayar ofis bilgisayarı olarak üretildi.");
    }

    @Override
    public void visit(Keyboard keyboard) {
        System.out.println("Klavye sessiz bir klavye seçildi.");
    }

    @Override
    public void visit(Monitor monitor) {
        System.out.println("Monitör göz sağlığını bozmayacak bir monitör seçildi.");
    }

    @Override
    public void visit(Mouse mouse) {
        System.out.println("Klasik mouse.");
    }
}
