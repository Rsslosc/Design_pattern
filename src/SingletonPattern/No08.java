package SingletonPattern;
/**
 * ö����ʽ
 * ����-*-���Է����л�
 */

public enum  No08 {
    INSTANCE;
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(INSTANCE.hashCode());
            }).start();
        }
    }
}