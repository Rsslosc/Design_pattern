package DecoratorPattern_Hamburger;

public class Lettuce extends DecoratorHamburger {
    private int price = 2;
    private String name = "Lettuce";

    public Lettuce(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public int price() {
        return hamburger.price() + price;
    }

    @Override
    public  String name() {
        return hamburger.name() + name;
    }

}
