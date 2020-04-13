package ObserverPattern_complex;

import java.util.ArrayList;

public class MassageController implements Controller {
    private ArrayList<Observer> arrayList = new ArrayList<>();
    private String massage;

    void setMassage(String massage) {
        if (massage != null && massage.length() != 0) {
            this.massage = massage;
        }
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
            observer.lookMassage(massage);
        }
    }
}
