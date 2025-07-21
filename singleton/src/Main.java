
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Singleton obj= Singleton.getInstance();
        obj.showMessage();
        Singleton obj1= Singleton.getInstance();
        obj1.showMessage();
        if(obj1==obj)
        {
            System.out.println("True");
        }
    }
}