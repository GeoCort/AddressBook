package address;
import java.io.*;
import address.data.AddressEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook mainBook =  new AddressBook();
        AddressEntry entry = new AddressEntry("George","contreras","20995 mission", "haywrtd","CA","37832732", "323@sdfhjkb","9292");
        AddressEntry entr1 = new AddressEntry("Cesar","cort","20995 mission", "Castro Valley","CA","37832732", "323@sdfhjkb","9292");
        AddressEntry entr3 = new AddressEntry("Richrard","cuchingot","20995 mission", "san JHose","CA","37832732", "323@sdfhjkb","9292");
        //AddressEntry entr2 = new AddressEntry("Uniborm","cubano","20995 mission", "haywrtd","CA","37832732", "323@sdfhjkb","9292");
        mainBook.add(entry);
        mainBook.add(entr1);
       // mainBook.add(entr2);
        mainBook.add(entr3);
//        Menu menu = new Menu(mainBook);
        System.out.println(mainBook.entry.size());
        mainBook.remove("c");
        System.out.println(mainBook.entry.size());
        mainBook.list();
    }

}