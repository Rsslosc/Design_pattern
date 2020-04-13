package DecoratorPattern_Shape;

public abstract class Decorator implements Shape {
    Shape shape;

    Decorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
    }
}
