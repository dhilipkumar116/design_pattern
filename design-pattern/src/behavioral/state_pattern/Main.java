package behavioral.state_pattern;

public class Main {

    // State design pattern is one of the behavioral design pattern. 
    // State design pattern is used when an Object change its behavior 
    // based on its internal state.
    
    public static void main(String[] args) {
        TvContext context = new TvContext();
        context.doAction();
        context.setState(new TvStartState());
        context.doAction();
        context.setState(new TvStopState());
        context.doAction();
    }
    
}
