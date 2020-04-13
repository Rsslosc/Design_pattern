package DecoratorPattern_Bing;

public class Main {
    public static void main(String[] args) {
        Bing bing = new DZBing();
        System.out.println(bing.price());

        Bing bing1 = new KaoChang(bing);
        System.out.println(bing1.price());

        Bing bing2 = new ShenCai(bing1);
        System.out.println(bing2.price());

    }
}
