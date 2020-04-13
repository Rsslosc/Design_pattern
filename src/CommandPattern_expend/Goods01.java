package CommandPattern_expend;

public class Goods01 implements Goods{
    private String name = "Goods01";
    private double price = 21.3;

    public void buy() {
        System.out.println("buy Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }

    public void sell() {
        System.out.println("sell Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }

}
