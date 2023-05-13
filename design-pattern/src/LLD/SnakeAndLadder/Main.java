package LLD.SnakeAndLadder;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {

        List<Snake> snakes = new ArrayList<>();
        snakes.add(new Snake(10, 2));
        snakes.add(new Snake(23, 9));
        snakes.add(new Snake(55, 40));
        snakes.add(new Snake(99, 3));

        List<Ladder> ladders = new ArrayList<>();
        ladders.add(new Ladder(5, 25));
        ladders.add(new Ladder(33, 95));
        ladders.add(new Ladder(60, 80));

        List<Player> players = new ArrayList<>();
        players.add(new Player("dhilip",0));
        players.add(new Player("kumar",0));


        SnakeAndLadderService snakeAndLadderService = new SnakeAndLadderService();
        snakeAndLadderService.setSnakes(snakes);
        snakeAndLadderService.setPlayers(players);
        snakeAndLadderService.setLadders(ladders);
        snakeAndLadderService.startGame();

    }

}
