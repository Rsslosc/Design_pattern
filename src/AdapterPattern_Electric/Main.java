package AdapterPattern_Electric;

public class Main {
    public static void main(String[] args) {
        ThreeElectric threeElectric;

        threeElectric = new Wash();
        threeElectric.connect();

        threeElectric = new Adapter(new TV());
        threeElectric.connect();

    }
}
