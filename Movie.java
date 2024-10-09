public class Movie {
    private String title;
    private String genre;
    private String duration; // Duration in format "HH:MM"
    private String director;

    public Movie(String title, String genre, String duration, String director) {
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.director = director;
    }

    // Getter and Setter methods
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
