import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        boolean exit = false;
        while (!exit) {
            menu();
            int choice = readChoice();
            switch (choice) {
                case 1:
                    addContact(contactManager);
                    break;
                case 2:
                    listContacts(contactManager);
                    break;
                case 3:
                    writeCSV(contactManager);
                    break;
                case 4:
                    readCSV(contactManager);
                    break;
                case 5:
                    //deleteContact();
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public static void menu() {
        System.out.println("Welcome to the PhoneBook Manager!");
        System.out.println("Choose an option:");
        System.out.println("1. Add a new contact");
        System.out.println("2. List all contacts");
        System.out.println("3. Write CSV");
        System.out.println("4. Read CSV");
        System.out.println("5. Delete a contact");
        System.out.println("6. Exit");
    }

    public static int readChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void addContact(ContactManager contactManager) {
        //create a new contact
        Scanner scanner = new Scanner(System.in);
        Contact contact = new Contact();
        contact.setPhoneNumber(promptForPhoneNumber(scanner));
        System.out.println("Enter group:");
        String group = scanner.next();
        contact.setGroup(group);
        System.out.println("Enter name:");
        String name = scanner.next();
        contact.setName(name);
        System.out.println("Enter address:");
        String address = scanner.next();
        contact.setAddress(address);
        System.out.println("Enter gender:");
        String gender = scanner.next();
        contact.setGender(gender);
        // Add contact to the list
        contactManager.add(contact);
    }

    public static String promptForPhoneNumber(Scanner scanner) {
        while (true) {
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.next();
            try {
                if (phoneNumber.length() >= 10 && phoneNumber.length() <= 11) {
                    return phoneNumber;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid phone number. Please enter a positive phone number.");
            }
        }
    }

    public static void listContacts(ContactManager contactManager) {
        List<Contact> contacts = contactManager.getAll();
        System.out.println("List of contacts:");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public static void writeCSV(ContactManager contactManager) {
        // write contacts to CSV file
        contactManager.writeCSV();
    }

    public static void readCSV(ContactManager contactManager) {
        // read contacts from CSV file and update the list
        List<Contact> contacts = contactManager.readCSV();
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }
}