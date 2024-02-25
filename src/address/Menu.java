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
        scan.close();
    }
    /**
     * prompt for First Name
     *
     * @return the First Name entered in by the user, if nothing entered in will use default
     */
    public static String prompt_FirstName() {
        System.out.println("First Name:");

        //for now return a default first name
        return "Jane";
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