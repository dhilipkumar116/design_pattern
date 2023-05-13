package structural.adapter_pattern.media_player;

public class Main {

    // Adapter pattern works as a bridge between two incompatible interfaces. 
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer();
        ap.play("mp3", "file1");
        ap.play("vlc", "file2");
        ap.play("mp4", "file3");
        ap.play("avg", "file4");
    }
    
}
