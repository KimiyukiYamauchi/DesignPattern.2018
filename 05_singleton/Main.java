public class Main {
    public static void main(String [] args) {
        Singleton obj1 = Singleton.getInstance();
        System.out.println(obj1);
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj2);
        Singleton obj3 = Singleton.getInstance();
        System.out.println(obj3);
        Singleton obj4 = Singleton.getInstance();
        System.out.println(obj4);
        /*
        Tripleton obj5 = Tripleton.getInstance();
        System.out.println(obj5);
        Tripleton obj6 = Tripleton.getInstance();
        System.out.println(obj6);
        Tripleton obj7 = Tripleton.getInstance();
        System.out.println(obj7);
        Tripleton obj8 = Tripleton.getInstance();
        System.out.println(obj8);
        Tripleton obj9 = Tripleton.getInstance();
        System.out.println(obj9);
        Tripleton obj10 = Tripleton.getInstance();
        System.out.println(obj10);
        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同じインスタンスです。");
        } else {
            System.out.println("obj1とobj2は同じインスタンスではありません。");
        }
        */

    }
}
