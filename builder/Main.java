public class Main {
    public static void main(String[] args) {
        TextBuilder builder = new TextBuilder();
        Director direcor = new Director(builder);
        direcor.construct();
        System.out.println(builder.getResult());
    }
}
