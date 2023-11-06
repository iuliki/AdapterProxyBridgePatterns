public abstract class Book {
    protected BookImplementation implementation;

    public Book(BookImplementation implementation) {
        this.implementation = implementation;
    }

    public abstract void print();
    public abstract void open();
    public abstract void turnPage();
}
