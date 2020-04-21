package DecoratorPattern_Hamburger;

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new ChickenBurger();
        Chilli chilli = new Chilli(hamburger);
        Lettuce lettuce = new Lettuce(chilli);

        System.out.println(lettuce.price());
        System.out.println(lettuce.name());

        Hamburger hamburger1 = new VegetableBurger();
        Chilli chilli1 = new Chilli(hamburger1);
        Chilli chilli2 = new Chilli(chilli1);
        Lettuce lettuce1 = new Lettuce(chilli2);

        System.out.println(lettuce1.price());
        System.out.println(lettuce1.name());
    }
}
