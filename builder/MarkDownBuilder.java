import java.io.*;

public class MarkDownBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public void makeTitle(String title) {
        filename = title + ".md";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("# " + title);
        writer.println();
    }
    @Override
    public void makeString(String str) {
        writer.println(str);
        writer.println();
    }
    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            writer.println("- " + items[i]);
        }
        writer.println();
    }
    @Override
    public void close() {
        writer.close();
    }
    @Override
    public String getResult() {
        return filename;
    }
}
