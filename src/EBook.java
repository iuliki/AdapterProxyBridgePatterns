public class EBook extends Book {
    public EBook(BookImplementation implementation) {
        super(implementation);
    }

    @Override
    public void print() {
        System.out.println("Displaying the eBook.");
    }

    @Override
    public void open() {
        System.out.println("Opening the eBook.");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning the eBook page.");
    }
}

