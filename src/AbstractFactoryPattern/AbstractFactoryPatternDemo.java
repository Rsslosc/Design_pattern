package AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape1 = null;
        if (shapeFactory != null) {
            shape1 = shapeFactory.getShape("CIRCLE");
            shape1.draw();
        }

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        Color color1 = null;
        if (colorFactory != null) {
            color1 = colorFactory.getColor("RED");
            color1.fill();
        }
    }
}
