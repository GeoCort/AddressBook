package address.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressEntryTest {

    @Test
    public void testToString() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        AddressEntry entry2 = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertTrue("same",entry.compareTo(entry2) ==0 );

    }

    @Test
    public void getFirstName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("George",entry.getFirstName());
    }
    @Test
    public void setFirstName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setFirstName("ipsum");
        assertEquals("ipsum",entry.getFirstName());
    }

    @Test
    public void getLastName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("Cortes",entry.getLastName());
    }

    @Test
    public void setLastName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setLastName("googaa");
        assertEquals("googaa",entry.getLastName());
    }

    @Test
    public void getStreet() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("20995 Mission Blvd",entry.getStreet());
    }

    @Test
    public void setStreet() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setStreet("googaa");
        assertEquals("googaa",entry.getStreet());
    }

    @Test
    public void getCity() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("Hayward",entry.getCity());
    }

    @Test
    public void setCity() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setCity("googaa");
        assertEquals("googaa",entry.getCity());
    }

    @Test
    public void getState() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("CA",entry.getState());
    }

    @Test
    public void setState() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setState("googaa");
        assertEquals("googaa",entry.getState());
    }

    @Test
    public void getPhone() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("5105555555",entry.getPhone());
    }

    @Test
    public void setPhone() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setPhone("googaa");
        assertEquals("googaa",entry.getPhone());
    }

    @Test
    public void getEmail() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("cortes.g@gmail.com",entry.getEmail());
    }

    @Test
    public void setEmail() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setLastName("email@email.com");
        assertEquals("email@email.com",entry.getLastName());
    }

    @Test
    public void getZip() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("94541",entry.getZip());
    }

    @Test
    public void setZip() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setZip("92992");
        assertEquals("92992",entry.getZip());
    }

    @Test
    public void equalsTo() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        AddressEntry entryTwo= new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertTrue("True", entry.equalsTo(entryTwo));
        AddressEntry entryThree= new  AddressEntry("George","Cortez","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertFalse("False", entry.equalsTo(entryThree));
    }

}