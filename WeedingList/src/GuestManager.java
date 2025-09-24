import java.util.Scanner;

public class GuestManager {
    private GuestList guestList;

    public GuestManager(GuestList guestList) {
        this.guestList = guestList;
    }

    public void addNewGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter guest's name: ");
        String name = scanner.nextLine();

        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Enter guest's age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                validAge = true;
            } else {
                System.out.println("Invalid input! Please enter a valid number for age.");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        System.out.print("Enter guest's invitation status: ");
        String invitationStatus = scanner.nextLine();
        Guests newGuest = new Guests(name, age, invitationStatus);
        guestList.addGuests(newGuest);  // Chama o método de GuestList
        System.out.println("Guest " + name + " has been added.");
    }

    public void viewGuests() {
        guestList.viewAllGuests();
    }

    public void viewGuestsDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the guest's name to search: ");
        String guestName = scanner.nextLine();
        guestList.viewGuestDetails(guestName);
    }


    public void removeGuest() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the guest's name to remove: ");
        String guestName = scanner.nextLine();
        guestList.removeGuest(guestName);
    }

    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            guestList.showMenu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addNewGuest();
                    break;
                case 2:
                    viewGuests();
                    break;
                case 3:
                    viewGuestsDetails();
                    break;
                case 4:
                    removeGuest();
                    break;
                case 5:
                    System.out.println("Exiting the system. Thank you!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose a valid option (1-5).");
            }
        } while (choice != 5);
    }
}
