package SingletonPattern;
/**
 * 枚举类式
 * 完美-*-可以反序列化
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
