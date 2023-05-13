package structural.adapter_pattern.media_player;

public class VLCPlayer implements AdvanceMediaPlayer{
    @Override
    public void playVLC(String filename){
        System.out.println("playing "+filename+".vlc");
    }
    @Override
    public void playMP4(String filename) {
        // do nothing
    }
}
