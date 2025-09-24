public class Property {
    private String location;
    private double size;
    private int number_rooms;
    private int number_bathrooms;
    private boolean parking_spaces;
    private boolean furnished;
    private double price;

    public Property(String location, int number_rooms, boolean parking_spaces, double price){
        this.location = location;
        this.number_bathrooms = number_rooms;
        this.parking_spaces = parking_spaces;
        this.price = price;
    }

    public String getLocation(){return this.location;}
    public void setLocation (String location){this.location = location;}

    public double getSize(){return this.size;}
    public void setSize(double size){this.size = size;}

    public int getNumber_rooms(){return this.number_rooms;}
    public void setNumber_rooms(int number_rooms){this.number_rooms = number_rooms;}

    public int getNumber_bathrooms() {return number_bathrooms;}
    public void setNumber_bathrooms(int number_bathrooms) {this.number_bathrooms = number_bathrooms;}

    public boolean isParking_spaces() {return parking_spaces;}
    public void setParking_spaces(boolean parking_spaces) {this.parking_spaces = parking_spaces;}

    public boolean isFurnished() {return furnished;}
    public void setFurnished(boolean furnished) {this.furnished = furnished;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}

    public void showProperty(){
        System.out.println("------Property Details-----");
        System.out.println("Location: " + location);
        System.out.println("Number of rooms: " + number_rooms);
        System.out.println("Does it have parking spaces: "  + parking_spaces);
        System.out.println("Price: " + price);
    }
}



