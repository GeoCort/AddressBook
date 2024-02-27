package address.data;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddressEntryTest {
    /**
     * Checks if the output of two Entry objects match
     */
    @Test
    public void testToString() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        AddressEntry entry2 = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertTrue("same",entry.compareTo(entry2) ==0 );

    }
    /**
     * tests for equivalence
     */
    @Test
    public void getFirstName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("George",entry.getFirstName());
    }

    /**
     * tests if the set function works
     */
    @Test
    public void setFirstName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setFirstName("ipsum");
        assertEquals("ipsum",entry.getFirstName());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getLastName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("Cortes",entry.getLastName());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setLastName() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setLastName("googaa");
        assertEquals("googaa",entry.getLastName());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getStreet() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("20995 Mission Blvd",entry.getStreet());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setStreet() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setStreet("googaa");
        assertEquals("googaa",entry.getStreet());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getCity() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("Hayward",entry.getCity());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setCity() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setCity("googaa");
        assertEquals("googaa",entry.getCity());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getState() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("CA",entry.getState());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setState() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setState("googaa");
        assertEquals("googaa",entry.getState());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getPhone() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("5105555555",entry.getPhone());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setPhone() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setPhone("googaa");
        assertEquals("googaa",entry.getPhone());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getEmail() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("cortes.g@gmail.com",entry.getEmail());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setEmail() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setLastName("email@email.com");
        assertEquals("email@email.com",entry.getLastName());
    }
    /**
     * tests for equivalence
     */
    @Test
    public void getZip() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertEquals("94541",entry.getZip());
    }
    /**
     * tests if the set function works
     */
    @Test
    public void setZip() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        entry.setZip("92992");
        assertEquals("92992",entry.getZip());
    }

    /**
     * Checks if two objects are equal
     */
    @Test
    public void equalsTo() {
        AddressEntry entry = new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        AddressEntry entryTwo= new  AddressEntry("George","Cortes","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertTrue("True", entry.equalsTo(entryTwo));
        AddressEntry entryThree= new  AddressEntry("George","Cortez","20995 Mission Blvd","Hayward","CA","5105555555","cortes.g@gmail.com", "94541");
        assertFalse("False", entry.equalsTo(entryThree));
    }

}