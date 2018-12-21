public class Test {
    public static void main(String[] args) {
        String[] str = {"hello", "こんにちは"};
        System.out.println(str[0] + ": " + str[0].getBytes().length);
        System.out.println(str[1] + ": " + str[1].getBytes().length);
        for (int i = 0; i < 2; i++) {
            if(str[i].length() == str[i].getBytes().length) {
                System.out.println(str[i] + ": " + str[i].length());
            } else {
                System.out.println(str[i] + ": " + str[i].length()*2);
            }
        }
    }
}
