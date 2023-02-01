package structural.decorator;

import structural.decorator.decorators.ShapeColorDecorator;
import structural.decorator.models.Circle;
import structural.decorator.models.Rectangle;
import structural.decorator.models.Shape;

public class Main {
    public static void main(String[] args) {
        // SAF hali
        Circle circle = new Circle();
        circle.draw();

        // SAF hali
        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("*************");

        // Dekore edilmiş
        Shape decoratedRectangle = new ShapeColorDecorator(new Rectangle());
        decoratedRectangle.draw();
        // Circle, Rectangle => setColorToRed();
    }
}
