package address.data;

public class AddressEntry implements Comparable<AddressEntry>  {
    String firstName;
    String lastName;
    String street;
    String city;
    String state;
    String phone;
    String email;
    String zip;

    /**
     * Base Constructor with default values
     * @author George Cortes
     */
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

    /**
     * @author George Cortes
     * @param firstName     first name of an entry
     * @param lastName      last name of an entry
     * @param street        the street of an entry
     * @param city          the city of an entry
     * @param state         the state of an entry
     * @param phone         the phone of an entry
     * @param email         the email of an entry
     * @param zip           the zip of an entry
     */
    public AddressEntry(String firstName, String lastName, String street, String city, String state, String phone, String email, String zip){
        this.firstName = firstName;
        this.lastName = lastName;
        this.street = street;;
        this.city  = city;
        this.state = state;
        this.phone = phone;
        this.email = email;
        this.zip   = zip;
    }

    /**
     * @author George Cortes
     * overrides the toString method to print into the system out
     * @return
     */
    public String toString(){
        return "FirstName: " + this.firstName +
                "\nLastName: " + this.lastName+
                "\nAddress: "+this.street + " " + this.city + " "+ this.state.toUpperCase() + ", " + this.zip +
                "\nTelephone #: " + this.phone+
                "\nEmail: " + this.email;
    }

    /**
     * @author George Cortes
     * gets the first Name of an Address Entry object
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @author George Cortes
     * Changes first name in an Address Entry to firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * @author George Cortes
     * Returns the last name of an Address Entry Object
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @author George Cortes
     * Sets the last name of an Address Entry Object to lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @author George Cortes
     * Returns the street of an Address Entry Object
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /**
     * @author George Cortes
     * changes the Street variable in an Address Entry object to street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * @author George Cortes
     * returns the city
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * @author George Cortes
     * Sets the city of an Address Entry object to city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @author George Cortes
     * gets the State of an Address Entry Object
     * @return String
     */
    public String getState() {
        return this.state;
    }

    /**
     * @author George Cortes
     * sets the state variable of an Address Entry Object to state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @author George Cortes
     * gets the Phone Number of an Address Entry object
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @author George Cortes
     * sets the PhoneNumber vairable of an Address Entry object to phone
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @author George Cortes
     * gets the email of an Address Entry object
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * @author George Cortes
     * sets the Email of an Address Entry object to email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @author George Cortes
     * gets the Zip code of an Address Entry object
     * @return int
     */
    public String getZip() {
        return zip;
    }

    /**
     * @author George Cortes
     * sets the Zip Code of an Address Entry object to zip
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * @author George Cortes
     * Compares an Address Entry for equivalence
     * @param entry
     * @return True if equal, false otherwise
     */
    public boolean equalsTo(AddressEntry entry){
        return this.firstName.compareTo(firstName) == 0
                && this.lastName.compareTo(entry.lastName) ==0
                && this.getPhone().compareTo(entry.getPhone()) == 0
                && this.getStreet().compareTo(entry.getStreet() )==0
                && this.getCity().compareTo(entry.getCity()) == 0
                && this.getEmail().compareTo(entry.getEmail() ) == 0
                && this.getState().compareTo(entry.getState() ) ==0
                && this.getZip().compareTo(entry.getZip() ) == 0;
    }

    /**
     * @author George Cortes
     * @param o the object to be compared.
     * @return -1 if o is larger, 0 if equal, and >0 if o is smaller
     */
    @Override
    public int compareTo(AddressEntry o) {
        if(this.getLastName().compareTo(o.getLastName()) == 0 ){
            return this.getFirstName().compareTo(o.getFirstName());
        }else{
            return this.getLastName().compareTo(o.getLastName());
        }

    }
}
