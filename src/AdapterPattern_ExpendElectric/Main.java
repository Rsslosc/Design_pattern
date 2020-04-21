package AdapterPattern_ExpendElectric;

public class Main {
    public static void main(String[] args) {
        ThreeElectric threeElectric;
        TwoElectric twoElectric;

        TwoThreeAdapter twoThreeAdapter = new TwoThreeAdapter(new TV(), new Wash());

        threeElectric = twoThreeAdapter;
        threeElectric.connect();

        twoElectric = twoThreeAdapter;
        twoElectric.connect();
    }
}
