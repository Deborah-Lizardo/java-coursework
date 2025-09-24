public class Hund {
    double gewicht;       // weight
    int alter;            // age
    String name;          // PetName
    String rasse;         // breed
    String farbe;         // color

    void bellen() {       //bellen() — latir
        System.out.println("Sagt: Wau wau!");
    }

    void kacken() {
        System.out.println("Muss kacken.");   // Needs to poop
    }

    void pinkeln() {
        System.out.println("Muss pinkeln.");  // Needs to pee
    }
}
