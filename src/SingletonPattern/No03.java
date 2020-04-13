package SingletonPattern;

/**
 * 懒汉式
 * 不安全
 */
public class No03 {
    private static No03 INSTANCE;
    private No03() {}

    static No03 getInstance() {
        if (INSTANCE == null) {
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new No03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(No03.getInstance().hashCode());
            }).start();
        }
    }

}
