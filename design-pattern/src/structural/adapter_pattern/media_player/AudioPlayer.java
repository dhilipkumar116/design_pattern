package structural.adapter_pattern.media_player;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("playing "+filename+".mp3");
        }else if(audioType.equalsIgnoreCase("vlc") || 
                        audioType.equalsIgnoreCase("mp4")){
            // call media adapter
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }else{
            System.out.println("invalid audio type");
        }
    }
    
}
