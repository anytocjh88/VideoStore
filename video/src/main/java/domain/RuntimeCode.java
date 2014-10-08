package domain;

/**
 * Runtime code
 */
public class RuntimeCode {
    public static void main(String[] args) {
        Customer customer = new Customer("Suwon Chae");
        customer.addRental(new Rental(new Movie("Once", Movie.REGULAR), 3));
        customer.addRental(new Rental(new Movie("Lucy", Movie.NEW_RELEASE), 1));
        System.out.println(customer.statement());
    }
}
