public class Address {

    private String street;
    private  int street_number;
    private String cep;
    private String neighborhood;
    private String city;
    private String country;


     public Address(String cep, String street, int street_number,String neighborhood,String city, String country){
         this.cep = cep;
         this.street = street;
         this.street_number = street_number;
         this.neighborhood = neighborhood;
         this.city = city;
         this.country = country;
     }

    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreet_number() {
        return street_number;
    }
    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNeighborhood() {
        return neighborhood;
    }
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
