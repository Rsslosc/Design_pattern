package ObserverPattern_complex;

public class Main {
    public static void main(String[] args) {

        MassageController controller1 = new MassageController();
        PriceController controller2 = new PriceController();

        controller1.addObserver(new Student01(controller1));
        controller1.addObserver(new Student02(controller2));
        controller2.addObserver(new Student01(controller1));
        controller2.addObserver(new Student02(controller2));

        controller1.setMassage("啦啦啦啦啦啦啦");
        controller2.setPrice(21.5);

        controller1.notifyObserver();
        controller2.notifyObserver();

    }


}
