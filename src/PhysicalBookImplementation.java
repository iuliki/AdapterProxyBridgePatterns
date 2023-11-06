public class PhysicalBookImplementation implements BookImplementation {
    @Override
    public void print() {
        System.out.println("Reading the physical book.");
    }

    @Override
    public void open() {
        System.out.println("Opening the physical book.");
    }

    @Override
    public void turnPage() {
        System.out.println("Turning the physical book page.");
    }
}
