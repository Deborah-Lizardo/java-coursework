import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner eingabe = new Scanner(System.in);
        int option;
        ArrayList<Album> albums = new ArrayList<>();

        do {
            System.out.println("*******Menü*******");
            System.out.println("1- Musik hinzufügen");
            System.out.println("2- Musik anzeigen");
            System.out.println("3- Beenden");

            option = eingabe.nextInt();
            eingabe.nextLine();

            switch(option) {
                case 1:
                    System.out.println("Bitte geben Sie das Genre ein:");
                    String genre = eingabe.nextLine();

                    System.out.println("Bitte geben Sie das Erscheinungsjahr ein:");
                    int jahr = eingabe.nextInt();
                    eingabe.nextLine();

                    System.out.println("Bitte geben Sie den Namen des Albums ein:");
                    String name = eingabe.nextLine();

                    System.out.println("Bitte geben Sie den Namen des Künstlers ein:");
                    Person person = new Person();
                    person.setName(eingabe.nextLine());

                    Album album = new Album(name, genre, jahr, person);

                    boolean weitereMusik = true;
                    while (weitereMusik) {
                        Musik musik = new Musik();

                        System.out.println("Bitte geben Sie den Namen des Liedes ein:");
                        musik.setTitel(eingabe.nextLine());

                        System.out.println("Bitte geben Sie die Dauer des Liedes ein (in Sekunden):");
                        musik.setDauer(eingabe.nextDouble());
                        eingabe.nextLine();

                        album.musikHinzufuegen(musik);

                        System.out.println("Möchten Sie ein weiteres Lied hinzufügen? (ja/nein)");
                        String antwort = eingabe.nextLine().toLowerCase();

                        if (!antwort.equals("ja")) {
                            weitereMusik = false;
                        }
                    }
                    albums.add(album);
                    break;
                case 2:
                    Album.zeigeAlbumListe(albums);

                    System.out.println("Geben Sie die Nummer des Albums ein, das Sie anzeigen moechten:");
                    int albumNummer = eingabe.nextInt();
                    eingabe.nextLine();

                    if (albumNummer >= 1 && albumNummer <= albums.size()) {
                        Album gewaehltesAlbum = albums.get(albumNummer - 1);
                        gewaehltesAlbum.zeigeAlbumDaten();

                    } else {
                        System.out.println("Ungueltige Album-Nummer. Versuchen Sie es erneut.");
                    }
                    break;

                case 3:
                    System.out.println("Beenden...");
                    break;

                default:
                    System.out.println("Ungültige Option. Versuchen Sie es erneut.");
            }

        } while(option != 3);
    }
}
