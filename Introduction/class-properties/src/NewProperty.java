public class NewProperty extends Property {

    public NewProperty(String location,int number_rooms, boolean parking_spaces, double price){
        super(location, number_rooms, parking_spaces, price);
    }

    public Double getNewPrice(){return this.getPrice()* 1.10;}
    public void setNewPrice(){
        double newPrice = getNewPrice();
        this.setPrice(newPrice);
    }

}
