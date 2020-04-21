package DecoratorPattern_Coffee;

public abstract class Decorate implements Coffee {
    Coffee coffee;

    public Decorate(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int price() {
        return coffee.price();
    }

    @Override
    public String description() {
        return coffee.description();
    }
}
