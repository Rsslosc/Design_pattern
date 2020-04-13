package CommandPattern_Book;

public class OffLightOrder implements Order {
    private Light light;

    OffLightOrder(Light light) {
        this.light = light;
    }

    @Override
    public void doExecute() {
        light.off();
    }

    @Override
    public void undoExecute() {
        light.on();
    }
}
