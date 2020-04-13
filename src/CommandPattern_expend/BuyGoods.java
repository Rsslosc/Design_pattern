package CommandPattern_expend;

public class BuyGoods implements Order {

    private Goods goods;

    public BuyGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void execute() {
        goods.buy();
    }
}
