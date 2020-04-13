package CommandPattern_expend;

public class Main {

    public static void main(String[] args) {
        //��������
        Goods01 goods01 = new Goods01();
        Goods02 goods02 = new Goods02();

        //����ִ�е���
        DoExecute doExecute = new DoExecute();

        //����ִ�е���ִ��ʲô
        doExecute.addOrder(new BuyGoods(goods01));
        doExecute.addOrder(new BuyGoods(goods02));
        doExecute.addOrder(new SellGoods(goods01));
        doExecute.addOrder(new SellGoods(goods02));

        //��ʼִ��
        doExecute.execute();


    }
}
