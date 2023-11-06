public class BookProxyImpl implements BookProxy {
    private RealBook realBook;

    public BookProxyImpl(String title) {
        this.realBook = new RealBook(title);
    }

    @Override
    public void display() {
        realBook.display();
    }

    @Override
    public void open() {
        realBook.open();
    }

    @Override
    public void close() {
        realBook.close();
    }
}
//asta e intermediarul
//intermediarul este responsabil de  comunicării și controlului între client și clasa reală.