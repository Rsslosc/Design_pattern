package SingletonPattern;

/**
 * 内部类式
 * 安全-*-
 */

public class No07 {
    private No07() {}
    private static class No07Holder {
        private final static No07 INSTANCE = new No07();
    }
    static No07 getInstance() {
        return No07Holder.INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(No07.getInstance().hashCode());
            }).start();
        }
    }

}
