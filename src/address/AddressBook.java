package address;

import address.data.AddressEntry;

import java.util.LinkedList;
import java.util.List;

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
        for(AddressEntry li : entry){
            System.out.println(li.toString());
            System.out.println();
        }
    }
    public void add(AddressEntry address){
        entry.add(address);
        return;
    }
}
