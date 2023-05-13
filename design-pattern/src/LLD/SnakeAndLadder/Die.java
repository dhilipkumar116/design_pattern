package LLD.SnakeAndLadder;

import java.util.Random;

public class Die {
    
    public static int roll() {
        return new Random().nextInt(6)+1;
    }

}
