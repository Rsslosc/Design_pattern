package AdapterPattern_Electric;

public class Wash implements ThreeElectric {
    private String name = "Wash wash wash";
    @Override
    public void connect() {
        System.out.println(name + "~~~~~~~lalalala");
    }
}
