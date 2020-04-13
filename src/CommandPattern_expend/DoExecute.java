package CommandPattern_expend;

import java.util.ArrayList;

public class DoExecute {
    private ArrayList<Order> arrayList = new ArrayList<>();

    void addOrder(Order order) {
        if (!arrayList.contains(order)) {
            arrayList.add(order);
        }
    }

    void execute() {
        for (Order order : arrayList) {
            order.execute();
        }
    }


}
