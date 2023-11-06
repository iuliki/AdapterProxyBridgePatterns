public class PhysicalBook2 extends Book {
    public PhysicalBook2(BookImplementation implementation) {
        super(implementation);
    }

    @Override
    public void print() {
        System.out.println("Citeste cartea fizica.");
    }

    @Override
    public void open() {
        System.out.println("Deschide cartea fizica.");
    }

    @Override
    public void turnPage() {
        System.out.println("Da oagina la cartea fizica.");
    }
}
