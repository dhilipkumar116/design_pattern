package structural.adapter_pattern.media_player;

public class MP4Player implements AdvanceMediaPlayer{
    @Override
    public void playVLC(String filename){
        // do nothing
    }
    @Override
    public void playMP4(String filename) {
        System.out.println("playing "+filename+".mp4");
    }
}