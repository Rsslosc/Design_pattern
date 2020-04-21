package DecoratorPattern_Hamburger;

public class Chilli extends DecoratorHamburger {
    private int price = 3;
    private String name = "Chilli";

    public Chilli(Hamburger hamburger) {
        super(hamburger);
    }

    @Override
    public int price() {
        return price + hamburger.price();
    }

    public String name() {
        return hamburger.name() + name;
    }

}
