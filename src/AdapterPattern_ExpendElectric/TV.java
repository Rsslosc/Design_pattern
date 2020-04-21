package AdapterPattern_ExpendElectric;

public class TV implements TwoElectric {
    String name = "TV";
    @Override
    public void connect() {
        System.out.println(name + "~~~lalala");
    }
}
