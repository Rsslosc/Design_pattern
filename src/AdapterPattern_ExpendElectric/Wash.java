package AdapterPattern_ExpendElectric;

public class Wash implements ThreeElectric {
    String name = "Wash";
    @Override
    public void connect() {
        System.out.println(name + "~~~~hahaha");
    }
}
