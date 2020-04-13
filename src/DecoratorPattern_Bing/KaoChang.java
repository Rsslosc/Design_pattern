package DecoratorPattern_Bing;

public class KaoChang extends Decorator {
    private static final double PRICE = 1.5;
    KaoChang(Bing bing) {
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
