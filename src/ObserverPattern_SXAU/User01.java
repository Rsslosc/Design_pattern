package ObserverPattern_SXAU;

public class User01 implements Observer {
    private Controllor controllor;

    User01(Controllor controllor) {
        this.controllor = controllor;
    }

    @Override
    public void readMassage(String massage) {
        if (controllor instanceof SXAUControllor) {
            System.out.println("User01 : " + massage);
        }
    }
}
