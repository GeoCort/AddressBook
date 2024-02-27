package address;
import java.io.*;
import address.data.AddressEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookApplication {
    public static void main(String[] args) throws FileNotFoundException {
        AddressBook mainBook =  new AddressBook();
        AddressEntry entry = new AddressEntry("George","Contreras","20995 mission", "Hayward","CA","510302732", "323@sdfhjkb","9292");
        AddressEntry entryz = new AddressEntry("George","Contrerssas","20995 mission", "Hayward","CA","510302732", "323@sdfhjkb","9292");
        AddressEntry entryzz = new AddressEntry("George","Contrersas","20995 mission", "Hayward","CA","510302732", "323@sdfhjkb","9292");

        AddressEntry entr1 = new AddressEntry("Cesar","Churchhill","20995 mission", "Castro Valley","CA","37832732", "323@sdfhjkb","9292");
        AddressEntry entr3 = new AddressEntry("Richrard","Cuchingot","20995 mission", "San Jose","CA","49930882", "323@sdfhjkb","9292");
        AddressEntry newmf = new AddressEntry("Muyibu","AppleSeed","2222 Redwood Rd", "Santa Cruz","CA","49930882", "323@sdfhjkb","9292");
        mainBook.add(entry);
        mainBook.add(entr1);
        mainBook.add(entr3);
        mainBook.add(newmf);
       Menu menu = new Menu(mainBook);


    }

}