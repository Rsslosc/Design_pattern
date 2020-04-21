package DecoratorPattern_Coffee;

public class Mocha extends Decorate {
    private int price = 3;
    private String description = "add Mocha";

    public Mocha(Coffee coffee) {
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
