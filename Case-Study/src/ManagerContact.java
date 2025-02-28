import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ManagerContact {
    private List<Contact> contacts = new ArrayList<Contact>();
    private static final String FILE_PATH = "src/data/contacts.csv";


    public void addContact(Contact contact) {
        if(!isValidPhoneNumber(contact.getPhoneNumber())){
            throw new IllegalArgumentException("Invalid phone number");
        }
        contacts.add(contact);
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^[0-9]{10}$");
    }

    public void updateContact(String phoneNumber, String group, String name, String gender, String address,
                              String birthday, String email) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)) {
                contact.update(group, name, gender, address, birthday, email);
                return;
            }
        }
        System.out.println("Contact not found");
    }
    public void deleteContact(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }
    public void searchContact(String query) {
        for (Contact contact : contacts) {
          if (contact.getPhoneNumber().equals(query) || contact.getName().toLowerCase().contains(query.toLowerCase()))  {
              System.out.println(contact);
          }
        }
    }
    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    public void sortContacts() {
        contacts.sort(Comparator.comparing(Contact::getName));
    }
    public void loadFromFile() {
        //Check file exist or not?
        System.out.println("Does it exist? " + new File(FILE_PATH).exists());
        System.out.println("The file has "+ new File(FILE_PATH).length() + " bytes");

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))){

            String line = null;
            boolean firstLine = true;
            while ((line = br.readLine()) != null){
                if (firstLine) {
                    firstLine = false;
                    continue;
                }
                Contact contact = Contact.fromCSV(line);
                if (contact != null) {
                    contacts.add(contact);
                }
            }
            System.out.println("Read " + contacts.size() + " contacts");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
    public void saveToFile() {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))){
            bw.write("PhoneNumber,Group,Name,Gender,Address,BirthDate,Email");
            bw.newLine();
            for (Contact contact : contacts) {
                bw.write(contact.toCSV());
                bw.newLine();
            }

        }
        catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());
            e.printStackTrace();
        }
    }
}
