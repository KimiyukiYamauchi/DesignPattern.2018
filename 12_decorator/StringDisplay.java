public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }
    @Override
    public int getColumns() {
        int col = string.length();
        if (col != string.getBytes().length)
            col *= 2;
        return col;
    }
    @Override
    public int getRows() {
        return 1;
    }
    @Override
    public String getRowText(int row) {
        if (row == 0) {
            return string;
        } else {
            return null;
        }
    }
}
