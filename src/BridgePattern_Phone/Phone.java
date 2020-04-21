package BridgePattern_Phone;

public abstract class Phone {
    public Memory phoneMemory;
    public void setMenory(Memory menory) {
        this.phoneMemory = menory;
    }
    public abstract void buyPhone();
}
