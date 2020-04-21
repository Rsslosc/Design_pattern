package BridgePattern_Phone;

public class XiaoMi extends Phone {
    @Override
    public void buyPhone() {
        phoneMemory.addMemory();
        System.out.println("XiaoMi");
    }
}
