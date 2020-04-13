package ObserverPattern_complex;

public interface Controller {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
