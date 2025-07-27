import Jumper.Jumpers;
import Jumper.LadderStrategy;
import Jumper.SnakeStrategy;

import java.util.List;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SnakeLadderSystem snakeLadderSystem=SnakeLadderSystem.getInstance();
        snakeLadderSystem.getBoard().setSize(100);
        Jumpers snake1= new SnakeStrategy(99,10);
        Jumpers snake2= new SnakeStrategy(50,30);
        Jumpers snake3= new SnakeStrategy(30,15);
        Jumpers ladder1= new LadderStrategy(22,70);
        Jumpers ladder2= new LadderStrategy(9,65);
        snakeLadderSystem.setJumpersList(List.of(snake1,snake2,snake3,ladder1,ladder2));
        for(Jumpers jumper:snakeLadderSystem.getJumpersList())
        {
            System.out.println(jumper.toString());
        }

        Player player1= new Player("1","Zeeshan");
        Player player2=new Player("2","Argh");
        snakeLadderSystem.setPlayerQueue(List.of(player2,player1));
        Queue<Player> queue= snakeLadderSystem.getPlayerQueue();
        int counter=0;
        while(!queue.isEmpty())
        {
            Player currPlayer= queue.poll();
            int currentLocation= currPlayer.getCurrentLocation();
            Dice dice=snakeLadderSystem.getDice();
            int diceValue=dice.rollDice();
            System.out.println("DICE VALUE"+ diceValue);
            if(currentLocation+diceValue<=snakeLadderSystem.getBoard().getSize())
            {
                currentLocation+=diceValue;
            }
          if(currentLocation==snakeLadderSystem.getBoard().getSize())
          {
              currPlayer.setCurrentLocation(currentLocation);
              System.out.println("Winner is "+currPlayer.toString());
              return;
          }


            for(Jumpers jumper:snakeLadderSystem.getJumpersList())
            {
                if(jumper.getStartingPostion()==currentLocation )
                {
                  currentLocation= jumper.getEndingPosition();

                  break;
                }
            }
            currPlayer.setCurrentLocation(currentLocation);
            System.out.println(counter+". "+currPlayer.toString());
            counter++;
            queue.add(currPlayer);
        }

    }
}