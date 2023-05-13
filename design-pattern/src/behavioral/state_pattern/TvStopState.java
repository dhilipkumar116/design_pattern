package behavioral.state_pattern;

public class TvStopState implements State {

    @Override
    public void doAction(){
        System.out.println("TV is tured off");
    }
    
}
