import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tier[] meineTiere = new Tier[6];

        meineTiere[0] = new Tier() {
            @Override
            public void som() {
                System.out.println("Der Hund bellt");
            }
        };
        meineTiere[1] = new Tier() {
            @Override
            public void som() {
                System.out.println("Der Jaguar brüllt");
            }
        };
        meineTiere[2] = new Tier() {
            @Override
            public void som() {
                System.out.println("Der Löwe brüllt");
            }
        };
        meineTiere[3] = new Tier() {
            @Override
            public void som() {
                System.out.println("Die Katze miaut");
            }
        };
        meineTiere[4] = new Tier() {
            @Override
            public void som() {
                System.out.println("Ein Tier macht einen allgemeinen Ton");
            }
        };
        meineTiere[5] = new Tier() {
            @Override
            public void som() {
                System.out.println("Der Vogel zwitschert");
            }
        };

        Scanner sc = new Scanner(System.in);
        int option = 9;
        do{
            System.out.println("Gib das Tier ein, dessen Geräusch du hören möchtest");
            System.out.println("1 - Hund");
            System.out.println("2 - Jaguar");
            System.out.println("3 - Löwe");
            System.out.println("4 - Katze");
            System.out.println("5 - Vogel");
            System.out.println("Alle Tiere");
            System.out.println("0 - Beenden");
            System.out.println("Gib das Tier ein, dessen Geräusch du hören möchtest");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    meineTiere[0].som();

                case 2:
                    meineTiere[1].som();

                case 3:
                    meineTiere[2].som();

                case 4:
                    meineTiere[3].som();

                case 5:
                    meineTiere[4].som();

                case 6:
                    for (Tier tier : meineTiere) {
                        tier.som();
                    }
            }

        }while(option != 0);


    }
}
