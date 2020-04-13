package ObserverPattern_complex;

import java.util.ArrayList;

public class PriceController implements Controller {
    private ArrayList<Observer> arrayList = new ArrayList<>();

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    private double price;

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
            observer.lookMassage(price);
        }
    }
}
