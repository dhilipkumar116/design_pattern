package behavioral.state_pattern;

public class TvContext implements State{

    private State currentTV_State;

    public TvContext(){
        // initial state, tv off
        this.currentTV_State = new TvStopState();
    }

    public void setState(State state){
        this.currentTV_State = state;
    }

    public State getState(){
        return this.currentTV_State;
    }

    @Override
    public void doAction(){
        this.currentTV_State.doAction();
    }

    
}
