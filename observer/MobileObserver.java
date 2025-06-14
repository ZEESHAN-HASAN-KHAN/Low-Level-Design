package observer;
public class MobileObserver implements ObserverInterface {
    private String name;

    public MobileObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("MobileObserver " + name + " received message: " + message);
    }

  
}