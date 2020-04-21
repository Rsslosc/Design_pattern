package BridgePattern_Phone;

public class Client {
    public static void main(String[] args) {
        Phone huawei = new HuaWei();
        huawei.setMenory(new Menory6G());
        huawei.buyPhone();


        Phone xiaomi = new XiaoMi();
        xiaomi.setMenory(new Menory8G());
        xiaomi.buyPhone();
    }
}
