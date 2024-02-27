package address;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MenuTest {

    @Test
    /**
     * user input prompted and returned as string
     * @return String first Name
     */
    public void prompt_firstName() {
        Menu menu = new Menu();
        String input = "Lambda";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Lambda",menu.prompt_lastName());
    }

    /**
     * user input prompted and returned as string
     * @return String last Name
     */
    @Test
    public void prompt_lastName() {
        Menu menu = new Menu();
        String input = "Lambda";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Lambda",menu.prompt_lastName());
    }

    /**
     * user input prompted and returned as string
     * @return String Street Name
     */
    @Test
    public void prompt_streetName() {
        Menu menu = new Menu();
        String input = "123 Apple Dr.";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("123 Apple Dr.",menu.prompt_streetName());
    }
    /**
     * user input prompted and returned as string
     * @return String city Name
     */
    @Test
    public void prompt_cityName() {
        Menu menu = new Menu();
        String input = "Miami";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("Miami",menu.prompt_cityName());
    }
    /**
     * user input prompted and returned as string
     * @return String State name
     */
    @Test
    public void prompt_stateName() {
        Menu menu = new Menu();
        String input = "NY";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("NY",menu.prompt_streetName());
    }
    /**
     * user input prompted and returned as string
     * @return String Phone Number
     */
    @Test
    public void prompt_phoneNumber() {
        Menu menu = new Menu();
        String input = "101111011";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("101111011",menu.prompt_phoneNumber());
    }
    /**
     * user input prompted and returned as string
     * @return String email
     */
    @Test
    public void prompt_emailName() {
        Menu menu = new Menu();
        String input = "anEmail@gma.il";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("anEmail@gma.il",menu.prompt_emailName());
    }
    /**
     * user input prompted and returned as string
     * @return String zipcode
     */
    @Test
    public void prompt_zipCode() {
        Menu menu = new Menu();
        String input = "94954";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals("94954",menu.prompt_zipCode());
    }
}