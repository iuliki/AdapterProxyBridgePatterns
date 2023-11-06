public class BookReaderApp {
    public static void main(String[] args) {
        PhysicalBook physicalBook = new PhysicalBook();
        BookReader reader = new PhysicalBookAdapter(physicalBook);

        reader.readBook();
    }
}
