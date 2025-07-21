import java.util.Random;

public class Singleton {

    private static  Singleton instance;
    private int random;
    private Singleton(){
        random = (int) (Math.random() * 100);
        System.out.println("Instance is created");
    }
    public static synchronized Singleton getInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();
        }
        return instance;
    }
    public void showMessage()
    {
        System.out.println("Random Number is "+random);
    }

}
