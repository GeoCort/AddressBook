package address;

import address.data.AddressEntry;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AddressBookApplication {
    public static void main(String[] args) {
        AddressBook mainBook =  new AddressBook();
        Menu menu = new Menu(mainBook);
    }

}
// 66 567 299