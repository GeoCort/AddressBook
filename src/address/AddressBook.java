package address;

import address.data.AddressEntry;

import java.util.*;

public class AddressBook {
    List<AddressEntry> entry;

    /**
     * @author George Cortes
     * default constructor initializes the linked list
     */
    AddressBook() {
        this.entry = new LinkedList<AddressEntry>();
    }

    /**
     * @author George Cortes
     * creates an AddressBook with e Address Entry elements added into it
     * @param e Linked List of Address Entries
     */
    AddressBook(List<AddressEntry>e){
        for(AddressEntry k : e){
            this.entry.add(k);
        }
    }

    /**
     * @author George Cortes
     * constructor that initializes an AddressBook with an Address Entry element e
     * @param e Address Entry
     */
    AddressBook(AddressEntry e){
        this.entry = new LinkedList<AddressEntry>();
        entry.add(e);
    }

    /**
     * @author George Cortes
     * displays the contents of the AddressBook
     * contents are in ascending order by last name
     */
    public void list(){
        if(entry.size() == 0) {
            System.out.println("This book is currently empty");
        }else{
            Collections.sort(this.entry);
            for(AddressEntry li : entry){
                System.out.println(li.toString());
                System.out.println();
            }
        }
    }

    /**
     * @author George Cortes
     * Adds address to AddressBook
     * Will ignore duplicates
     * @param address   An Address Entry object
     */
    public void add(AddressEntry address){
        for(AddressEntry e : this.entry){
            if(e.equalsTo(address)){
                return;
            }
        }
        entry.add(address);
    }

    /**
     * @author George Cortes
     * Searches the AddressBook for partial and exact matches of user given string
     * returns none if no results found
     * @param lastNameEntry     User inputted string used to search the Address Book
     */
    public void find(String lastNameEntry){
        Set<AddressEntry> found = new HashSet<AddressEntry>();
        System.out.println("THE ENTRY IS : " + lastNameEntry);
        int count = 0;
        for(AddressEntry record : this.entry){
            if(record.getLastName().contains(lastNameEntry)){
                found.add(record);
                System.out.println(count++ + " : \n" +record);
                System.out.println();
            }
        }
        if(found.size() == 0){
            System.out.println("No results found");
        }
    }

    /**
     * @author George Cortes
     * removes an entry from a searched list
     * @param entry     user inputted string
     * @return true if successfully removed; false if not removed
     */
    public boolean remove(String entry){
        Set<AddressEntry> found = new HashSet<AddressEntry>();
        Scanner scan = new Scanner(System.in);
        int count = 0;
        // set of search qualifying entries
        for(AddressEntry record : this.entry){
            if(record.getLastName().contains(entry)){
                found.add(record);
            }
        }
        count =0;
        for(AddressEntry f : found){
            System.out.print("index : " + count++ + f);
        }

        if(found.size() == 0){
            System.out.println("These is no matches for this search query");
            return false;
        }else {
            System.out.println("Using the index, what is the contact you would like to remove?:");
            int opt = scan.nextInt();
            scan.nextLine();
            AddressEntry option = null;
            count =0;
            for(AddressEntry f : found){
                if(count == opt){
                    option = f;
                }
                count++;
            }
            this.entry.remove(option);
            return true;
        }
    }

}
