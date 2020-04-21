package PrototypePattern;

import java.util.Hashtable;

class ShapeCache {
    private static Hashtable<String, Shape> shapeHashtable = new Hashtable<String, Shape>();

    static Shape getShape(String shapeId) throws CloneNotSupportedException {
        Shape cacheShape = shapeHashtable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeHashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeHashtable.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeHashtable.put(rectangle.getId(), rectangle);
    }
}
