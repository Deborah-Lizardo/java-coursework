import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Film> filmeListe = new ArrayList<>();

        filmeListe.add(new Film("Der Exorzist", "Horror", 1973));
        filmeListe.add(new Film("Halloween", "Horror", 1978));
        filmeListe.add(new Film("Nightmare – Mörderische Träume", "Horror", 1984));
        filmeListe.add(new Film("Conjuring – Die Heimsuchung", "Horror", 2013));
        filmeListe.add(new Film("Hereditary – Das Vermächtnis", "Horror", 2018));

        for (Film film : filmeListe) {
            System.out.println("Titel: " + film.getTitel());
            System.out.println("Genre: " + film.getGenre());
            System.out.println("Erscheinungsjahr: " + film.getErscheinungsjahr());
            System.out.println();
        }
    }
}
