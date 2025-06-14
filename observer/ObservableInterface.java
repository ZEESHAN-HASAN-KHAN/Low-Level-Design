package observer;
public interface ObservableInterface {
    
    void addObserver(ObserverInterface observer);
    void removeObserver(ObserverInterface observer);
    void notifyObservers(String message);
   
}