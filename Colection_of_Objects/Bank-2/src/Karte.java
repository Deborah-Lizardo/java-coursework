public class Karte {

    int karte_nummer;
    int cvv;
    String expiration_date;

    public Karte(int karte_nummer,int cvv, String expiration_date){
        this.karte_nummer = karte_nummer;
        this.cvv =  cvv;
        this.expiration_date = expiration_date;
    }
}
