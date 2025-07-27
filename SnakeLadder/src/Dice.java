import java.util.Random;

public class Dice {
    private static Dice instance;
    public static synchronized Dice getInstance()
    {
        if(instance==null)
        {
            instance=new Dice();
        }
        return instance;
    }

    // to give me a number ranges from 1-6

    int rollDice()
    {
        Random random = new Random();
        return random.nextInt(5) + 1;
    }
}
