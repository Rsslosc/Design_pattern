package CommandPattern_Book;

public class OnLightOrder implements Order {
    private Light light;

    OnLightOrder(Light light) {
        this.light = light;
    }

    @Override
    public void doExecute() {
        light.on();
    }

    @Override
    public void undoExecute() {
        light.off();
    }
}
