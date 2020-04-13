package CommandPattern_expend;

public class Goods02 implements Goods{
    private String name = "Goods02";
    private double price = 45.78;

    public void buy() {
        System.out.println("buy Goods02{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }
    public void sell() {
        System.out.println("sell Goods02{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }
}
