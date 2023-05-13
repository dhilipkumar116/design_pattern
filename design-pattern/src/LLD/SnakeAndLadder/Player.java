package LLD.SnakeAndLadder;

public class Player {

    private String name;
    private int position;
    private boolean hasWon;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void setPostion(int position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getHasWon() {
        return hasWon;
    }
    public void setHasWon(Boolean won) {
        this.hasWon = won;
    }
    
}
