package ObserverPattern_Text;

public interface Controller {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    void notifyObserver();
}
