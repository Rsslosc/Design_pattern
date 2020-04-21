package AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("VlcPlayer working" + fileName);
    }

    @Override
    public void playMP4(String fileName) {

    }
}
