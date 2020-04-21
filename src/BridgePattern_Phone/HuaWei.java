package BridgePattern_Phone;

public class HuaWei extends Phone {
    @Override
    public void buyPhone() {
        phoneMemory.addMemory();
        System.out.println("HuaWei");
    }
}
