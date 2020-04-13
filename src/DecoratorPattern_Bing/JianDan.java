package DecoratorPattern_Bing;

public class JianDan extends Decorator {
    private static final double PRICE = 1;
    JianDan(Bing bing) {
        super(bing);
    }
    @Override
    public double price() {
        return bing.price() + AddPrice();
    }
    private double AddPrice(){
        return PRICE;
    }

}
