package CommandPattern;

public class SellGoods implements Order{
    Goods goods;

    public SellGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void execute() {
        goods.sell();
    }
}
