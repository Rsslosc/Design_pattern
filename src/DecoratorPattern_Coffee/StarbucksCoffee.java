package DecoratorPattern_Coffee;

public class StarbucksCoffee implements Coffee {
    int price = 10;
    String description = "I am StarbucksCoffee";

    @Override
    public int price() {
        return price;
    }

    @Override
    public String description() {
        return description;
    }
}
