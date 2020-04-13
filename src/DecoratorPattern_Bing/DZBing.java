package DecoratorPattern_Bing;

public class DZBing implements Bing {
    public static final double PRICE = 3;

    @Override
    public double price() {
        return PRICE;
    }
}
