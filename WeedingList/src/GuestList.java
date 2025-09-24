import java.util.ArrayList;

public class GuestList {
    private ArrayList<Guests> guestsList = new ArrayList<Guests>();

    public GuestList() {}

    public ArrayList<Guests> getGuests() { return guestsList; }
    public void setGuests(ArrayList<Guests> guests) { this.guestsList = guests; }
    public void addGuests(Guests guest) { guestsList.add(guest); }

    public void viewAllGuests() {
        if (guestsList.isEmpty()) {
            System.out.println("No guests saved in the system.");
        } else {
            System.out.println("------List of guests------");
            for (int i = 0; i < guestsList.size(); i++) {
                System.out.println((i + 1) + ". " + "Name: " + guestsList.get(i).getName());
                System.out.println("Age: " +  guestsList.get(i).getAge());
                System.out.println("Invitation Status: " + guestsList.get(i).getInvitationStatus());
            }
            System.out.println("--------------------------");
            System.out.println("Total of guests so far: " + guestsList.size());
        }
    }

    public void viewGuestDetails(String guestName) {
        boolean found = false;
        for (Guests guest : guestsList) {
            if (guest.getName().equalsIgnoreCase(guestName)) {
                System.out.println("------------Guest " + guestName + " details -----------");
                System.out.println("Name: "+ guest.getName());
                System.out.println("Age: " + guest.getAge());
                System.out.println("Invitation Status: " + guest.getInvitationStatus());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Guest " + guestName + " is not in the list.");
        }
    }

    public void removeGuest(String guestName) {
        boolean found = false;
        for (int i = 0; i < guestsList.size(); i++) {
            if (guestsList.get(i).getName().equalsIgnoreCase(guestName)) {
                guestsList.remove(i);
                System.out.println("Guest " + guestName + " was removed from the list.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Guest " + guestName + " is not in the list.");
        }
    }

    public void showMenu() {
        System.out.println("------ Wedding Guest Management System ------");
        System.out.println("1. Add a new guest");
        System.out.println("2. View all guests");
        System.out.println("3. View guest details");
        System.out.println("4. Remove a guest");
        System.out.println("5. Exit the system");
        System.out.print("Choose an option (1-5): ");
    }
}
