package structural.facade_pattern;

public class BookingFacade {
    public void createBooking(User user) {
        TicketSystem ts = new TicketSystem();
        if(ts.isTicketAvailable()) {
            System.out.println("user loged in...");
            ts.createTicket(user, 10 , "varisu");

            PaymentSystem ps = new PaymentSystem();
            ps.makePayment();

            Notification n = new Notification();
            n.sendEmail(ts.getUser());

        }

    }
}
