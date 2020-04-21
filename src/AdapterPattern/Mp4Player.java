package AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMP4(String fileName) {
        System.out.println("Mp4 working" + fileName);
    }
}
