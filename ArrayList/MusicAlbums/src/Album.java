import java.util.ArrayList;
import java.util.Scanner;

public class Album {
    private String genre;
    private Integer jahr;
    private String name;
    private Person kuenstler;
    private ArrayList<Musik> musikListe = new ArrayList<>();
    private ArrayList<Album> albumsListe = new ArrayList<>();

    public Album(String name, String genre, Integer jahr, Person kuenstler) {
        this.name = name;
        this.genre = genre;
        this.jahr = jahr;
        this.kuenstler = kuenstler;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public Integer getJahr() { return jahr; }
    public void setJahr(Integer jahr) { this.jahr = jahr; }

    public Person getKuenstler() { return kuenstler; }
    public void setKuenstler(Person kuenstler) { this.kuenstler = kuenstler; }

    public ArrayList<Musik> getMusikListe() { return musikListe; }
    public void setMusikListe(ArrayList<Musik> musikListe) { this.musikListe = musikListe; }

    public ArrayList<Album> getAlbumsListe() { return albumsListe; }
    public void addAlbum(Album album) { albumsListe.add(album); }

    public void musikHinzufuegen(Musik musik) { musikListe.add(musik); }
    public void musikEntfernen(Musik musik) { musikListe.remove(musik); }

        public static void zeigeAlbumListe(ArrayList<Album> albums) {
            if (albums.isEmpty()) {
                System.out.println("Keine Alben vorhanden.");
            } else {
                System.out.println("Liste der Alben:");
                for (int i = 0; i < albums.size(); i++) {
                    System.out.println((i + 1) + ". " + albums.get(i).getName());
                }
            }
        }

        public void zeigeAlbumDaten() {
            System.out.println("Album: " + getName());
            System.out.println("Künstler: " + getKuenstler().getName());
            System.out.println("Genre: " + getGenre());
            System.out.println("Jahr: " + getJahr());
            System.out.println("Liste der Lieder:");

            if (musikListe.isEmpty()) {
                System.out.println("Keine Lieder in diesem Album.");
            } else {
                for (Musik musik : musikListe) {
                    System.out.println("Titel: " + musik.getTitel());
                    System.out.println("Dauer: " + musik.getDauer() + " Sekunden");
                    System.out.println("----------------------------");
                }
            }
        }
}
