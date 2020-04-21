package BuilderPattern;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public double price() {
        return 30.5;
    }
}
