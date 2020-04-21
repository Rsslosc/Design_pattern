package DecoratorPattern_Hamburger;

public abstract class DecoratorHamburger implements Hamburger{
    Hamburger hamburger;

    public DecoratorHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public int price(){
        return hamburger.price();
    }
    public String name() {
        return hamburger.name();
    }

}
