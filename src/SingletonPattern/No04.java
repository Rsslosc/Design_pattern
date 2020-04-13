package SingletonPattern;

/**
 * 懒汉式
 * 安全
 * 缺点：效率低
 */

public class No04 {
    private static No04 INSTANCE;
    private No04() {}

    static synchronized No04 getInstance() {
        if (INSTANCE == null) {
            try{
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new No04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(No04.getInstance().hashCode());
            }).start();
        }
    }
}
