import observer.MobileObserver;
import observer.ObservableConcrete;
import observer.ObservableInterface;
import observer.ObserverInterface;
import observer.TvObserver;

public class Main {
    public static void main(String[] args) {
        // Create observable
        ObservableInterface observable = new ObservableConcrete();

        // Create observers
        ObserverInterface tvObserver1 = new TvObserver("TV1");
        ObserverInterface tvObserver2 = new TvObserver("TV2");
        ObserverInterface mobileObserver1 = new MobileObserver("Mobile1");
        ObserverInterface mobileObserver2 = new MobileObserver("Mobile2");

        // Add observers to observable
        observable.addObserver(tvObserver1);
        observable.addObserver(tvObserver2);
        observable.addObserver(mobileObserver1);
        observable.addObserver(mobileObserver2);

        // Notify observers with a message
        observable.notifyObservers("Breaking News: New Observer Pattern Example!");
    }
}