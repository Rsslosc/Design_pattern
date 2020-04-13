package DecoratorPattern_Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Decorator circleDecorator = new RedShapeDecorator(circle);
        Decorator rectangleDecorator = new RedShapeDecorator(rectangle);

        circle.draw();
        rectangle.draw();

        circleDecorator.draw();
        rectangleDecorator.draw();

    }
}
