import java.util.ArrayList;
import java.util.List;

public class Showtime {
    private String movieTitle;
    private String startTime;
    private String endTime;
    private List<Ticket> ticketsSold;

    public Showtime(String movieTitle, String startTime, String endTime) {
        this.movieTitle = movieTitle;
        this.startTime = startTime;
        this.endTime = endTime;
        this.ticketsSold = new ArrayList<>();
    }

    public void addTicket(Ticket ticket) {
        ticketsSold.add(ticket);
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public List<Ticket> getTicketsSold() {
        return ticketsSold;
    }
}
