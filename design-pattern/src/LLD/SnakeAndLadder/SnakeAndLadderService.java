package LLD.SnakeAndLadder;

import java.util.*;

public class SnakeAndLadderService {
    
    private Board board;
    private Queue<Player> players;

    public SnakeAndLadderService() {
        this.board = Board.getBoard();
        players = new LinkedList<>();
    }

    public Board getBoard() {
        return board;
    }
    
    public void setSnakes(List<Snake> snakes) {
        board.setSnakes(snakes);
    }

    public void setLadders(List<Ladder> ladders) {
        board.setLadders(ladders);
    }

    public List<Snake> getSnakes() {
        return board.getSnakes();
    }

    public List<Ladder> getLadders() {
        return board.getLadders();
    }

    public void setPlayers(List<Player> players) {
        Map<Player,Integer> map = new HashMap<>();
        for(Player player : players) {
            this.players.add(player);
            map.put(player, 0);
        }
        board.setPositionMap(map); 
    }

    public boolean isGameCompleted() {
        if(players.size() == 1) {
            return true;
        }
        return false;
    }

    public void startGame() {
        int size = 0;
        Player curPlayer;
        int diePosition;
        while(!isGameCompleted()) {
            size = players.size();
            for(int i = 0; i < size; i++) {
                curPlayer = players.remove();
                diePosition = Die.roll();
                movePlayer(curPlayer,diePosition);
                
                if(!curPlayer.getHasWon()) {
                    players.add(curPlayer);
                }

                if(curPlayer.getPosition() == board.getSize() && players.size() == 2) {
                    // cur player has won
                    // this logic is only for 2 players
                    break;
                }
            }
        }
    }

    public void movePlayer(Player curPlayer, Integer diePosition) {

        Integer curPosition = board.getPosition(curPlayer);
        int destiPosition = curPosition+diePosition;
        if(curPosition == 0 && diePosition != 6) {
            System.out.println(curPlayer.getName()+" has not started the game.");
            return;
        }

        if(destiPosition == board.getSize()) {
            System.out.println(curPlayer.getName()+" has won the game.");
            curPlayer.setHasWon(true);
            board.setPosition(curPlayer, destiPosition); 
            curPlayer.setPostion(destiPosition);
            return;           
        }
        
        // check for snakes
        for(Snake snake : board.getSnakes()) {
            if(destiPosition == snake.getStart()) {
                board.setPosition(curPlayer, snake.getEnd());
                curPlayer.setPostion(snake.getEnd());
                System.out.println(curPlayer.getName()+" has bitten by snake and moved to "+snake.getEnd()+".");
                return;
            }
        }

        // check for ladders
        for(Ladder ladder : board.getLadders()) {
            if(destiPosition == ladder.getStart()) {
                board.setPosition(curPlayer, ladder.getEnd());
                curPlayer.setPostion(ladder.getEnd());
                System.out.println(curPlayer.getName()+" has got ladder and moved to "+ladder.getEnd()+".");
                return;
            }
        }

        if(destiPosition > board.getSize()) {
            return;
        }

        System.out.println(curPlayer.getName()+" rolled : "+diePosition+" and moved to : "+destiPosition);
        board.setPosition(curPlayer, destiPosition);
        curPlayer.setPostion(destiPosition);

    }
}
