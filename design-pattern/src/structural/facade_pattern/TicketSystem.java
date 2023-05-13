package structural.facade_pattern;

public class TicketSystem {
    private User user;
    private int noOfTickets;
    private String movie;
    protected boolean isTicketAvailable(){
        return true;
    }

    protected void createTicket(User user,int noOfTickets, String movie) {
        this.user = user;
        this.noOfTickets = noOfTickets;
        this.movie = movie;
        System.out.println("ticket booked for "+movie);
    }

    public User getUser(){
        return user;
    }
    public int getNoOfTickets() {
        return noOfTickets;
    }
    public String getMovie() {
        return movie;
    }

}
