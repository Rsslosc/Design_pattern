package CommandPattern;

public class BuyGoods implements Order {

    Goods goods;

    public BuyGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void execute() {
        goods.buy();
    }
}
