package address;
import java.io.*;
import address.data.AddressEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook mainBook =  new AddressBook();
        AddressEntry entry = new AddressEntry("George","contreras","20995 mission", "Hayward","CA","510302732", "323@sdfhjkb","9292");
        AddressEntry entr1 = new AddressEntry("Cesar","cort","20995 mission", "Castro Valley","CA","37832732", "323@sdfhjkb","9292");
        AddressEntry entr3 = new AddressEntry("Richrard","cuchingot","20995 mission", "san JHose","CA","49930882", "323@sdfhjkb","9292");
        AddressEntry newmf = new AddressEntry("Muyibu","AppleSeed","2222 Rewdoow", "san JHose","CA","49930882", "323@sdfhjkb","9292");
        AddressEntry tests = new AddressEntry("Muyibu","AppleSeed","2222 Rewdoow", "san JHose","CA","49930882", "323@sdfhjkb","9292");

        mainBook.add(entry);
        mainBook.add(entr1);
        mainBook.add(entr3);
        mainBook.add(newmf);
        mainBook.add(tests);
        Menu menu = new Menu(mainBook);


    }

}