public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;
    // コンストラクタ
    // 本棚のサイズを受け取って領域を確保
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }
    // 任意の位置のbookの取得
    public Book getBookAt(int index) {
        return books[index];
    }
    // 本棚に本を追加
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }
    // 現在の本の数を返す
    public int getLength() {
        return last;
    }
    // イテレータを返す
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
