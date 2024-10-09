import java.util.ArrayList;
import java.util.List;

public class Booking {
    private User user;
    private List<Ticket> tickets;

    public Booking(User user) {
        this.user = user;
        this.tickets = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        tickets.add(ticket);
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public User getUser() {
        return user;
    }
}
