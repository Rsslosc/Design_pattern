package ObserverPattern_Text;

import java.util.ArrayList;

public class TextController implements Controller {
    private ArrayList<Observer> arrayList = new ArrayList<>();
    private String massage;

    public void seedMassage(String massage) {
        this.massage = massage;
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        if (!arrayList.contains(observer)) {
            arrayList.add(observer);
        }
    }

    @Override
    public void deleteObserver(Observer observer) {
        arrayList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : arrayList) {
            observer.showMassage(massage);
        }
    }
}
