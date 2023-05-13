package LLD.SnakeAndLadder;

import java.util.*;

public class Board {

    private int size;
    private List<Snake> snakes;
    private List<Ladder> ladders;
    private Map<Player, Integer> positionMap;

    private Board(int size) {
        this.size  = size;
        snakes = new ArrayList<>();
        ladders = new ArrayList<>();
        positionMap = new HashMap<>();
    }

    public static Board board = new Board(100);

    public static Board getBoard() {
        return board;
    }

    public void setSnakes(List<Snake> snakes) {
        this.snakes = snakes;
    }

    public void setLadders(List<Ladder> ladders) {
        this.ladders = ladders;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public List<Ladder> getLadders() {
        return ladders;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public Map<Player,Integer> getPositionMap() {
        return positionMap;
    }

    public void setPositionMap(Map<Player,Integer> map) {
        this.positionMap = map;
    }

    public Integer getPosition(Player player) {
        return positionMap.get(player);
    }
    public void setPosition(Player player, int position) {
        positionMap.put(player, position);
    }
    
}
