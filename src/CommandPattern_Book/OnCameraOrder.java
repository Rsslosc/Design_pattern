package CommandPattern_Book;

public class OnCameraOrder implements Order {
    private Camera camera;

    OnCameraOrder(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void doExecute() {
        camera.on();
    }

    @Override
    public void undoExecute() {
        camera.off();
    }
}
