public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            usage();
            System.exit(0);
        }
        String opt = args[0];
        if (opt.equals("plain") || opt.equals("html") || opt.equals("markdown")) {
            Builder builder = null;
            if (opt.equals("plain")) {
                builder = new TextBuilder();
            } else if (opt.equals("html")){
                builder = new HTMLBuilder();
            } else {
                builder = new MarkDownBuilder();
            }
            Director direcor = new Director(builder);
            direcor.construct();
            System.out.println(builder.getResult());
        } else {
            usage();
            System.exit(0);
        }
    }
    public static void usage() {
        System.out.println("Usage: java Main plain");
        System.out.println("Usage: java Main html");
        System.out.println("Usage: java Main markdown");
    }
}
