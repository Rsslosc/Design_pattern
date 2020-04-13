package CommandPattern;

public class Main {

    public static void main(String[] args) {
        Goods goods = new Goods();

        BuyGoods buyGoods = new BuyGoods(goods);
        SellGoods sellGoods = new SellGoods(goods);

        DoExecute doExecute = new DoExecute();

        doExecute.addOrder(buyGoods);
        doExecute.addOrder(sellGoods);

        doExecute.execute();


    }
}
