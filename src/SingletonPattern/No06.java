package SingletonPattern;

/**
 * ����ʽ ˫���ж�
 * ��ȫ-*-
 * ȱ�㣺Ч�ʵ�
 */

public class No06 {
    private static volatile No06 INSTANCE;  //JITʱ��ֹ�������
    private No06() {}

    static No06 getInstance() {
        if (INSTANCE == null) {
            synchronized (No06.class) {
                if (INSTANCE == null) {
                    try{
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new No06();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(No06.getInstance().hashCode());
            }).start();
        }
    }
}
