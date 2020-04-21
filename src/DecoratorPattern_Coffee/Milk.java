package DecoratorPattern_Coffee;

public class Milk extends Decorate {
    private int price = 2;
    private String description = "add milk";

    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public int price() {
        return coffee.price() + price;
    }

    @Override
    public String description() {
        return coffee.description() + description;
    }

}
