package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addItem(Item item) {
        items.add(item);
    }
    public double getCost() {
        double cost = 0.0;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }
    public void showItem() {
        for (Item item : items) {
            System.out.println("Item:" + item.name() + "," +
                    "Packing :" + item.packing().pack() + "," +
                    "Price :" + item.price());
        }
    }
}
