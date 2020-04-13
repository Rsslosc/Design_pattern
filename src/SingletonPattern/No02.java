package SingletonPattern;


/**
 * 饿汉式
 * 安全
 * 缺点：首先初始化对象
 */
class No02 {
    private static No02 INSTANCE;
    static {
        INSTANCE = new No02();
    }
    private No02() {}

    static No02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        No01 no01_1 = No01.getInstance();
        No01 no01_2 = No01.getInstance();
        System.out.println(no01_1 == no01_2);
    }
}
