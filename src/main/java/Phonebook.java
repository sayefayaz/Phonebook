import java.util.ArrayList;
import java.util.Objects;

public class Phonebook {
    private final ArrayList<Person> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Person contact){
        contacts.add(contact);
    }

    public String getPhoneNumber(String name){
        for (Person contact : contacts) {
            if(contact == null)
                return "Contact Not Found";
            if(Objects.equals(contact.getName(), name))
                return contact.getPhone();
        }
        return "Contact Not Found";
    }

    public int getContact(String name){
        for (Person contact : contacts) {
            if (contact == null)
                return 0;
            else if (Objects.equals(contact.getName(), name)) {
                System.out.println(contact);
                return 1;
            }
        }
        return 0;
    }
    public int updateContactName(String name, String newName){
        for (Person contact : contacts) {
            if (contact == null)
                return 0;
            else if (Objects.equals(contact.getName(), name)) {
                contact.setName(newName);
                return 1;
            }
        }
        return 0;
    }
    public int updateContactPhoneNumber(String name, String newPhone){
        for (Person contact : contacts) {
            if (contact == null)
                return 0;
            else if (Objects.equals(contact.getName(), name)) {
                contact.setPhone(newPhone);
                return 1;
            }
        }
        return 0;
    }
    public int deleteContact(String name){
        for (Person contact : contacts) {
            if (contact == null)
                return 0;
            if(Objects.equals(contact.getName(), name)){
                contacts.remove(contact);
                return 1;
            }
        }
        return 0;
    }
    public ArrayList<Person> getAllContacts(){
        return contacts;
    }
    public void setAllContactsHidden(){
        for (Person contact : contacts) {
            if(contact == null)
                return;
            contact.setHidden();
        }
    }
    public void setAllContactsUnHidden(){
        for (Person contact : contacts){
            if(contact == null)
                return;
            contact.setUnHidden();
        }
    }
}
