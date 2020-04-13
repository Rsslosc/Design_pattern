package CommandPattern_Book;

public class OffCameraOrder implements  Order {
    private Camera camera;

    OffCameraOrder(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void doExecute() {
        camera.off();
    }

    @Override
    public void undoExecute() {
        camera.on();
    }
}
