package DecoratorPattern_Coffee;

public class luckinCoffee implements Coffee {
    int price = 20;
    String description = "I am luckinCoffee";

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description;
    }
}
