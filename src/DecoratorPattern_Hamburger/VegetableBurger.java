package DecoratorPattern_Hamburger;

public class VegetableBurger implements Hamburger {
    private int price = 20;
    private String name = "VegetableBurger";

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }
}
