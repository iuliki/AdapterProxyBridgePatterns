public class PhysicalBookAdapter implements BookReader {
    private PhysicalBook physicalBook;

    public PhysicalBookAdapter(PhysicalBook physicalBook) {
        this.physicalBook = physicalBook;
    }

    @Override
    public void readBook() {
        physicalBook.openBook();
        System.out.println("Reading the physical book.");
    }
}
//aici are loc legatura intre phisical book si book reader
//adapteaza clasa phisical book...