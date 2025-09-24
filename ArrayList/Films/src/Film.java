public class Film {
    private String titel;
    private String genre;
    private int erscheinungsjahr;

    public Film(String titel, String genre, int erscheinungsjahr) {
        this.titel = titel;
        this.genre = genre;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getTitel() {
        return titel;
    }

    public String getGenre() {
        return genre;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }
}
