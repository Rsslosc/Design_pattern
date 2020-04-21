package AdapterPattern;

public class AudioPlayer implements MediaPlayer {
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("mp3 player :" + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);//�򲹶�
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("not find ");
        }
    }
}
