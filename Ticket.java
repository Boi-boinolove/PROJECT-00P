public class Ticket {
    private int ticketId;
    private Movie movie;
    private User user;
    private String showTime;

    public Ticket(int ticketId, Movie movie, User user, String showTime) {
        this.ticketId = ticketId;
        this.movie = movie;
        this.user = user;
        this.showTime = showTime;
    }

    // Getter and Setter methods
    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
}
