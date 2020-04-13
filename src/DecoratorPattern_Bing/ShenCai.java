package DecoratorPattern_Bing;

import DecoratorPattern_Shape.Shape;

public class ShenCai extends Decorator {
    private static final double PRICE = 0.5;
    ShenCai(Bing bing) {
        super(bing);
    }
    @Override
    public double price() {
        return bing.price() + addPrice();
    }

    private double addPrice() {
        return PRICE;
    }

}
