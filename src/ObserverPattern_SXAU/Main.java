package ObserverPattern_SXAU;

public class Main {
    public static void main(String[] args) {
        Controllor controllor = new SXAUControllor();

        User01 user01 = new User01(controllor);
        User02 user02 = new User02(controllor);

        controllor.addObserver(user01);
        controllor.addObserver(user02);

        ((SXAUControllor)controllor).setMassage("a massage");

    }
}
