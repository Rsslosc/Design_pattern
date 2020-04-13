package CommandPattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;

public class DoExecute {
    ArrayList<Order> arrayList = new ArrayList<>();

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
