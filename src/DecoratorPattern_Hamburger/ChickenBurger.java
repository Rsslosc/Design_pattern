package DecoratorPattern_Hamburger;

public class ChickenBurger implements Hamburger {
    private int price = 20;
    private String name = "ChickenBurger";

    @Override
    public int price() {
        return price;
    }

    @Override
    public String name() {
        return name;
    }
}
