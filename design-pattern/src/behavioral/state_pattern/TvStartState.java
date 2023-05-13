package behavioral.state_pattern;

public class TvStartState implements State{
    @Override
    public void doAction(){
        System.out.println("TV is turned on");
    }
}