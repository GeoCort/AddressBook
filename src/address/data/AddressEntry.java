package address.data;

public class AddressEntry {
    String firstName;
    String lastName;
    String street;
    String city;
    String State;
    String phone;
    String email;
    String zip;

    public AddressEntry(){
        setFirstName("");
        setLastName("");
        setZip("");
        setEmail("");
        setPhone("");
        setState("");
        setCity("");
        setStreet("");
    }
    public AddressEntry(String firstName, String lastName, String street, String city, String State, String phone, String email, String zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;;
        this.city  = city;
        this.State = State;
        this.phone = phone;
        this.email = email;
        this.zip   = zip;
    }
    public String toString(){
        return "firstName: " + this.firstName +
                "\nlastName: " + this.lastName+
                "\nAddress: "+this.street + " " + this.city + " "+ this.State.toUpperCase() + ", " + this.zip +
                "\nTelephone #: " + this.phone+
                "\nEmail: " + this.email;


    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
