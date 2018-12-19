public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
        System.out.println("インスタンスを生成しました。");
    }
    public static Singleton getInstance() {
        return singleton;
    }
    static void p() {
        System.out.println("インスタンス =>" + singleton);
    }
}
