package structural.facade_pattern;

public class Demo {

    public static void main(String[] args) {
        // this pattern is commonly used. it linkes all complex subsystem in a single
        // facade block.
        // Simply put, a facade encapsulates a complex subsystem behind a simple
        // interface.
        // It hides much of the complexity and makes the subsystem easy to use.
        User user = new User("dhilip", "dhilip@gmail.com", 8825861408L);
        BookingFacade bf = new BookingFacade();
        bf.createBooking(user);

    }

}
