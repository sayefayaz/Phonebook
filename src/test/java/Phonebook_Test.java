import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class Phonebook_Test {
    @Test
    public void addcontact_test() {
        Phonebook phonebook = new Phonebook();
        Person person1 = new Person("saye", "09055524298");
        Person person2 = new Person("maryam", "09912650261");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
    }
    @Test
    public void getPhoneNumber_test() {
        Phonebook phonebook = new Phonebook();
        Person person1 = new Person("saye", "09055524298");
        Person person2 = new Person("maryam", "09912650261");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals("09055524298", phonebook.getPhoneNumber("saye"));
        assertEquals("09912650261", phonebook.getPhoneNumber("maryam"));
    }
    @Test
    public void getContact_test()
    {
        Phonebook phonebook=new Phonebook();
        Person person1=new Person("saye","09055524298");
        Person person2=new Person("maryam","09912650261");
        phonebook.addContact(person1);
        phonebook.addContact(person2);
        assertEquals("saye",phonebook.getContact("09055524298"));
        assertEquals("maryam",phonebook.getContact("09912650261"));

    }

}