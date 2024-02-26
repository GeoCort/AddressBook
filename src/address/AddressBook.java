package address;

import address.data.AddressEntry;

import java.util.*;

public class AddressBook {
    List<AddressEntry> entry;
    AddressBook() {
        this.entry = new LinkedList<AddressEntry>();
    }
    AddressBook(List<AddressEntry>e){
        for(AddressEntry k : e){
            this.entry.add(k);
        }
    }

    public void list(){
        if(entry.size() == 0) {
            System.out.println("This book is currently empty");
        }else{
            for(AddressEntry li : entry){
                System.out.println(li.toString());
                System.out.println();
            }
        }
    }
    public void add(AddressEntry address){
        entry.add(address);
        return;
    }
    public void find(String lastNameEntry){
        Set<AddressEntry> found = new HashSet<AddressEntry>();
        int count = 0;
        for(AddressEntry record : this.entry){
            if(record.getLastName().contains(lastNameEntry)){
                found.add(record);
             System.out.println(count++ + " : " +record);
                System.out.println();
            }
        }
        if(found.size() == 0){
            System.out.println("No results found");
        }
    }
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
            System.out.println("index : " + count++ + f);
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
