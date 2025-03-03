import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactManager implements IManager<Contact>{
    private static final String FILE_NAME = "/Users/admin/Documents/CODEGYM/java-core/document/contacts.csv";
    List<Contact> contacts;
    public ContactManager(){
        contacts = new ArrayList<Contact>();
    }
    @Override
    public List<Contact> getAll() {
        return contacts;
    }

    @Override
    public void add(Contact contact) {
        contacts.add(contact);
    }

    @Override
    public void writeCSV() {
        String COMMA = ",";
        try {
            FileWriter fileWriter = new FileWriter(FILE_NAME, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contact contact : contacts) {
                bufferedWriter.write(contact.getPhoneNumber()+ COMMA + contact.getGroup()+ COMMA + contact.getName() + COMMA + contact.getAddress() + COMMA + contact.getGender());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Contact> readCSV(){
        List<Contact> contacts = new ArrayList<Contact>();
        String COMMA = ",";
        try {
            FileReader fileReader = new FileReader(FILE_NAME);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] values = line.split(COMMA);
                Contact contact = new Contact();
                contact.setPhoneNumber(values[0]);
                contact.setGroup(values[1]);
                contact.setName(values[2]);
                contact.setAddress(values[3]);
                contact.setGender(values[4]);
                contacts.add(contact);
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
