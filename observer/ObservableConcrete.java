package observer;

import java.util.ArrayList;
import java.util.List;


public class ObservableConcrete implements ObservableInterface {
    private List<ObserverInterface> observers = new ArrayList<>();

    @Override
    public void addObserver(ObserverInterface observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverInterface observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (ObserverInterface observer : observers) {
            observer.update(message);
        }
    }
}