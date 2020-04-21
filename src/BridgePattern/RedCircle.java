package BridgePattern;

public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing red, " + radius + "x: " + x + "y:" + y);
    }
}
