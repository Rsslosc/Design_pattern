package AdapterPattern_ExpendElectric;

public class TwoThreeAdapter implements ThreeElectric, TwoElectric {
    private TwoElectric twoElectric;
    private ThreeElectric threeElectric;

    public TwoThreeAdapter(TwoElectric twoElectric, ThreeElectric threeElectric) {
        this.twoElectric = twoElectric;
        this.threeElectric = threeElectric;
    }

    public TwoThreeAdapter(ThreeElectric threeElectric, TwoElectric twoElectric) {
        this.twoElectric = twoElectric;
        this.threeElectric = threeElectric;
    }


    @Override
    public void connect() {
        if (this instanceof ThreeElectric) {
            twoElectric.connect();
        }
        if (this instanceof TwoElectric) {
            threeElectric.connect();
        }
    }
}
