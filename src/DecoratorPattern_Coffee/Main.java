package DecoratorPattern_Coffee;

public class Main {

    public static void main(String[] args) {
        Coffee coffee = new StarbucksCoffee();
        Milk milk = new Milk(coffee);
        Mocha mocha = new Mocha(milk);

        System.out.println(mocha.description());
        System.out.println(mocha.price());
    }
}
