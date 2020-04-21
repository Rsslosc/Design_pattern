package AdapterPattern_Electric;

public class TV implements TwoElectric {
    private String name = "TV tv tv";

    @Override
    public void connect() {
        System.out.println(name + "~~~~~~wawawawa");
    }
}
