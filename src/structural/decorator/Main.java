package structural.decorator;

import structural.decorator.decorators.ShapeColorDecorator;
import structural.decorator.models.Circle;
import structural.decorator.models.Rectangle;
import structural.decorator.models.Shape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();


        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        System.out.println("*************");

        Shape decoratedRectangle = new ShapeColorDecorator(new Rectangle());
        decoratedRectangle.draw();
        // Circle, Rectangle => setColorToRed();
    }
}
