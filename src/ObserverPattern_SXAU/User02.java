package ObserverPattern_SXAU;

public class User02 implements Observer {
    Controllor controllor;

    public User02(Controllor controllor) {
        this.controllor = controllor;
    }

    @Override
    public void readMassage(String massage) {
        if (controllor instanceof SXAUControllor) {
            System.out.println("User02 : " + massage);
        }
    }
}
