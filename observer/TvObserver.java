package observer;
public class TvObserver implements ObserverInterface {
    private String name;

    public TvObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("TvObserver " + name + " received message: " + message);
    }
}