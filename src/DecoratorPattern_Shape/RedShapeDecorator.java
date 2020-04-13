package DecoratorPattern_Shape;

public class RedShapeDecorator extends Decorator {

    RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        shape.draw();
        setRed(shape);
    }

    private void setRed(Shape shape) {
        System.out.println(shape + "set Red");
    }

}
