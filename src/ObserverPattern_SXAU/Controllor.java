package ObserverPattern_SXAU;

public interface Controllor {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
