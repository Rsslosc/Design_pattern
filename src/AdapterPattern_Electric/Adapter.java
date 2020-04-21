package AdapterPattern_Electric;

public class Adapter implements ThreeElectric {
    private TwoElectric twoElectric;

    public Adapter(TwoElectric twoElectric) {
        this.twoElectric = twoElectric;
    }

    @Override
    public void connect() {
        twoElectric.connect();
    }
}
