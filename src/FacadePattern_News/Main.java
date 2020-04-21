package FacadePattern_News;

public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade("abcdefghjklmnopqrstuvwxyz");
        int i = facade.doFacade();
        System.out.println("you need pay : " + i);
    }
}
