package structural.adapter_pattern.media_player;

public class MediaAdapter implements MediaPlayer {

    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer = new VLCPlayer();
        }else{
            advanceMediaPlayer = new MP4Player();
        }
    }

    @Override
    public void play(String audioType, String filename){
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVLC(filename);
        }else{
            advanceMediaPlayer.playMP4(filename);
        }
    }
    
}
