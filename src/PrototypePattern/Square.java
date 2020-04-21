package PrototypePattern;

class Square extends Shape {
    Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Square draw()");
    }
}
