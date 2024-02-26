package address;
import address.data.AddressEntry;

import java.util.Scanner;

public class Menu {
    public AddressBook currentBook;
    Menu(AddressBook currentBook){
        this.currentBook = currentBook;
        displayMenu();
    }

    public void displayMenu(){
        char option = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("************************");
            System.out.println("Please enter your menu selection");
            System.out.println("a) Loading From File");
            System.out.println("b) Add a Contact");
            System.out.println("c) Remove a Contact");
            System.out.println("d) Find a Contact");
            System.out.println("e) Listing");
            System.out.println("f) Quit Program");
            System.out.println("************************");
            option = scan.next().charAt(0);
            if(option < 'a' || option >'f'){
                System.out.println("Wrong input value, please try again");
            }
        }while(option < 'a' || option > 'f');
        switch (option){
            case 'b':
                addition();
                displayMenu();
                break;
            case 'c':
                System.out.println("Search for which contact you would like to remove:");
                    this.currentBook.find(prompt_lastName());

            case 'd':
                System.out.println("Find a contact by lastName:");
                this.currentBook.find(prompt_lastName());
                displayMenu();
                break;
            case 'e':
                this.currentBook.list();
                displayMenu();
                break;
            case 'f':
            default:
                break;
        }
    }

    /**
     * Adding an additional entry into the address book
     * This function will prompt user with the necessary information
     * @return successful if user added, fail if the information criteria is not correct
     */
    public void addition(){
// prompt for user information
        System.out.println("Add a new contact");
        String firstName = prompt_firstName();
        String lastName = prompt_lastName();
        String street = prompt_streetName();
        String city = prompt_cityName();
        String state = prompt_stateName();
        String phone = prompt_phoneNumber();
        String email = prompt_emailName();
        String zipCode = prompt_zipCode();
        AddressEntry entry = new AddressEntry(firstName,lastName,street,city,state,phone,email,zipCode);
        currentBook.add(entry);
    }
    /**
     * prompt for First Name
     *
     * @return the First Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_firstName() {
        System.out.print("First Name:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if(in.length() < 25)
            return in;
        else
            return "";
    }

    /**
     * prompt for Last Name
     *
     * @return the Last Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_lastName() {
        System.out.print("Last Name:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        if(in.length()> 2 && in.length() < 25) {
            return in;
        }else{
            return "";
         }
    }
    /**
     * prompt for Street
     *
     * @return the Street Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_streetName() {
        System.out.print("Street Name:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        return in;
    }
    /**
     * prompt for City
     *
     * @return the City Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_cityName() {
        System.out.print("City Name:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        return in;
    }
    /**
     * prompt for State Abbreviation
     *
     * @return the State Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_stateName() {
        System.out.print("State Name:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        return in;
    }
    /**
     * prompt for Phone Number
     *
     * @return the Phone Number entered in by the user, if nothing entered in will use default
     */
    public String prompt_phoneNumber() {
        System.out.print("Phone number:");
        Scanner scan = new Scanner(System.in);
        String in = scan.nextLine();
        in = in.replace("-", ""); // remove user inputs such as dashes
        in = in.replace("(", ""); // remove user inputs such as Parens
        in = in.replace(")", ""); // remove user inputs such as Parens
        in = in.replace("+", ""); // remove user inputs such as pluses
        return in;
    }
    /**
     * prompt for Email
     *
     * @return the Email Name entered in by the user, if nothing entered in will use default
     */
    public String prompt_emailName() {
        Scanner scan = new Scanner(System.in);
        String in = "";
        do{
            System.out.print("Please give out email:");
            in = scan.nextLine();
            if(in.length() < 3) {
                System.out.println("Email address too short. Try again");
                continue;
            }
        }while(!in.contains("@") );

        return in;
    }
    /**
     *  Returns the Zip Code for an address Book
     * @return ZIP CODE for user
     */
    public String prompt_zipCode(){
        System.out.print("Zip Code: ");
        Scanner scan = new Scanner(System.in);
        String in = "";
        in = scan.nextLine();
        return in;

    }
}