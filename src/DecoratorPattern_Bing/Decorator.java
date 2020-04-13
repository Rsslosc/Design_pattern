package DecoratorPattern_Bing;

public abstract class Decorator implements Bing {
    Bing bing;
    Decorator(){}
    Decorator(Bing bing) {
        this.bing = bing;
    }
}
