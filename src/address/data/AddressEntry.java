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
     * Base Constructor with defaul values
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
     *
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
     * gets the first Name of an Address Entry object
     * @return String
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Changes first name in an Address Entry to firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Returns the last name of an Address Entry Object
     * @return String
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of an Address Entry Object to lastName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the street of an Address Entry Object
     * @return String
     */
    public String getStreet() {
        return street;
    }

    /**
     * changes the Street variable in an Address Entry object to street
     * @param street
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * returns the city
     * @return String
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of an Address Entry object to city
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * gets the State of an Address Entry Object
     * @return String
     */
    public String getState() {
        return this.state;
    }

    /**
     * sets the state variable of an Address Entry Object to state
     * @param state
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * gets the Phone Number of an Address Entry object
     * @return String
     */
    public String getPhone() {
        return phone;
    }

    /**
     * sets the PhoneNumber vairable of an Address Entry object to phone
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * gets the email of an Address Entry object
     * @return String
     */
    public String getEmail() {
        return email;
    }

    /**
     * sets the Email of an Address Entry object to email
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * gets the Zip code of an Address Entry object
     * @return int
     */
    public String getZip() {
        return zip;
    }

    /**
     * sets the Zip Code of an Address Entry object to zip
     * @param zip
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Compares an Address Entry for equivalence
     * @param entry
     * @return True if equal, false otherwise
     */
    public boolean equalsTo(AddressEntry entry){
        return this.firstName == entry.firstName
                && this.lastName == entry.lastName
                && this.getPhone() == entry.getPhone()
                && this.getStreet() == entry.getStreet()
                && this.getCity() == entry.getCity()
                && this.getEmail() == entry.getEmail()
                && this.getState() == entry.getState()
                && this.getZip() == entry.getZip();
    }

    /**
     *
     * @param o the object to be compared.
     * @return -1 if o is larger, 0 if equal, and >0 if o is smaller
     */
    @Override
    public int compareTo(AddressEntry o) {
        if(this.getLastName() == o.getLastName()){
            return this.getFirstName().compareTo(o.getFirstName());
        }else{
            return this.getLastName().compareTo(o.getLastName());
        }

    }
}
