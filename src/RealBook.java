public class RealBook implements BookProxy {
    private String title;

    public RealBook(String title) {
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Displaying the book: " + title);
    }

    @Override
    public void open() {
        System.out.println("Opening the book: " + title);
    }

    @Override
    public void close() {
        System.out.println("Closing the book: " + title);
    }
}
