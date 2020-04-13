package CommandPattern_expend;

public class Main {

    public static void main(String[] args) {
        //创建货物
        Goods01 goods01 = new Goods01();
        Goods02 goods02 = new Goods02();

        //创建执行的人
        DoExecute doExecute = new DoExecute();

        //告诉执行的人执行什么
        doExecute.addOrder(new BuyGoods(goods01));
        doExecute.addOrder(new BuyGoods(goods02));
        doExecute.addOrder(new SellGoods(goods01));
        doExecute.addOrder(new SellGoods(goods02));

        //开始执行
        doExecute.execute();


    }
}
