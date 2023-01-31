package behavioral.observer;

public class OctalConverter extends Observer{
    public OctalConverter(Subject subject){
        this.subject = subject;
        this.subject.subscribe(this);
    }

    @Override
    public void update() {
        int number = this.subject.getNumber();
        System.out.println("Değişen yeni değerin Octal değeri: " + Integer.toOctalString(number));
    }
}
