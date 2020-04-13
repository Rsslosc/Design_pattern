package SingletonPattern;

/**
 * ����ʽ
 * ��ȫ-*-
 * ȱ�㣺���ȳ�ʼ������
 */
class No01 {
    private static final No01 INSTANCE = new No01();
    private No01() {}

    static No01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        No01 no01_1 = No01.getInstance();
        No01 no01_2 = No01.getInstance();
        System.out.println(no01_1 == no01_2);
    }
}
