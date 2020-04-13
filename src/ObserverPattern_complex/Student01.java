package ObserverPattern_complex;

public class Student01 implements Observer {
    private Controller controller;

    public Student01(Controller controller) {
        this.controller = controller;
    }

    @Override
    public void lookMassage(Object massage) {
        if (massage instanceof String) {
            System.out.println("Student01{" +
                    "massage='" + massage + '\'' +
                    '}');
        } else if (massage instanceof Double) {
            System.out.println("Student01{" +
                    "massage='" + massage + '\'' +
                    '}');
        }
    }
}
