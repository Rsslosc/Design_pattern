package ObserverPattern_SXAU;

import java.util.ArrayList;

public class SXAUControllor implements Controllor {
    private String massage;

    private ArrayList<Observer> arrayList = new ArrayList<>();

    public void setMassage(String massage) {
        if (massage != null && massage.length() != 0) {
            this.massage = massage;
        }
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
            observer.readMassage(massage);
        }
    }
}
