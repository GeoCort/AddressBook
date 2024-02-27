package address;

import address.data.AddressEntry;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class AddressBookTest {
    /**
     * Checks if one instance is matched to the output of a AddressBook object
     */
    @Test
    public void list() {
        AddressBook book = new AddressBook();
        AddressBook book2 = new AddressBook();
        AddressEntry e = new AddressEntry("Muyibu","AppleSeed","2222 Redwood Rd", "Santa Cruz","CA","49930882", "323@sdfhjkb","9292");
        book.add(e);
        book2.add(e);
        for(AddressEntry ev : book.entry){
            assertTrue(ev.toString().compareTo(e.toString()) ==0 );
        }

    }

    /**
     * Checks if addition was successful via the size increment
     */
    @Test
    public void add() {
        AddressBook book = new AddressBook();
        AddressEntry e = new AddressEntry("Muyibu","AppleSeed","2222 Redwood Rd", "Santa Cruz","CA","49930882", "323@sdfhjkb","9292");
        book.add(e);
        assertTrue(book.entry.size() == 1);
    }
}