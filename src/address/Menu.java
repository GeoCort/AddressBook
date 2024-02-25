package address;

import java.util.Scanner;

public class Menu {


    Menu(){
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
            case'b':
                addition();
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
    public static Boolean addition(){
        Scanner scan = new Scanner(System.in); // get input from user
        // prompt user for information
        System.out.println("Add a new contact");
        System.out.println("Please enter a first name");
        String input = "";
        input = scan.nextLine();
        System.out.println(input + "waasup");
        return false;
    }

    /**
     * Test if the input from user meets criteria
     * @return 1 for success, 0 otherwise
     */boolean promptChecker(String input){
       return (input.length() <= 2 || input.length() > 20) ? false :true;
    }
    /**
     * prompt for Last Name
     *
     * @return the Last Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_lastName() {
        System.out.print("First Name:");

        //for now return a default first name
        return "Jane";
    }
}