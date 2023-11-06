public class BookApp {
    public static void main(String[] args) {
        BookImplementation ebookImplementation = new EBookImplementation();
        BookImplementation physicalBookImplementation = new PhysicalBookImplementation();

        Book ebook = new EBook(ebookImplementation);
        Book physicalBook = new Book(physicalBookImplementation) {
            @Override
            public void print() {

            }

            @Override
            public void open() {

            }

            @Override
            public void turnPage() {

            }
        };

        ebook.print();
        ebook.open();
        ebook.turnPage();

        System.out.println();

        physicalBook.print();
        physicalBook.open();
        physicalBook.turnPage();
    }
}
