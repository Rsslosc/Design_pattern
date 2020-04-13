package SingletonPattern;

/**
 * ����ʽ
 * ����ȫ
 * ȱ�㣺Ч�ʵ�
 */

public class No05 {
    private static No05 INSTANCE;
    private No05() {}

    static No05 getInstance() {
        if (INSTANCE == null) {
            synchronized (No05.class) {
                try{
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new No05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(No05.getInstance().hashCode());
            }).start();
        }
    }
}
