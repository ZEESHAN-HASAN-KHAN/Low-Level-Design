import Jumper.Jumpers;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SnakeLadderSystem {
    private List<Jumpers> jumpersList;
    private Queue<Player> playerQueue;
    private Board board;
    private Dice dice;
    private static SnakeLadderSystem instance;
    public static  synchronized SnakeLadderSystem getInstance()
    {
        if(instance==null)
        {
            instance= new SnakeLadderSystem();

        }
        return instance;
    }
    public List<Jumpers> getJumpersList() {
        return jumpersList;
    }

    public void setJumpersList(List<Jumpers> jumpersList) {
        this.jumpersList = jumpersList;
    }

    public Queue<Player> getPlayerQueue() {
        return playerQueue;
    }

    public void setPlayerQueue(List<Player> players) {
        playerQueue.addAll(players);
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }



    public SnakeLadderSystem()
    {
        this.board=Board.getInstance();
        this.dice=Dice.getInstance();
        this.jumpersList=new ArrayList<>();
        this.playerQueue=new LinkedList<>();
    }




}
