import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
//implements IManager<Contact>
public class ManagerContact  {
    List<Contact> contacts;
    private static final String FILE_PATH = "src/data/contacts.csv";

//    @Override
//    public List<T> getList() {
//        return contacts;
//    }
//
//    @Override
//    public void add(Contact contact) {
//        contacts.add(contact);
//
//    }
//
//    @Override
//    public void writeCSV() {
//        String COMMA_DELIMITER = ",";
//
//    }
//
//    @Override
//    public List<T> readCSV() {
//        return 0;
//    }
//
//    @Override
//    public void remove(Contact contact) {
//
//    }
//
//    @Override
//    public void clear() {
//
//    }

    public ManagerContact() {
        contacts = new ArrayList<Contact>();
    }

    public void addContact(Contact contact) {
        if (!isValidPhoneNumber(contact.getPhoneNumber()) || !isValidEmail(contact.getEmail())) {
            throw new IllegalArgumentException("Invalid phone number or email");
        }
        contacts.add(contact);
        System.out.println("Contact added");
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("^[0-9]{10}$");
    }

    public void updateContact(String updatePhone, String updateGroup, String updateName, String updateGender, String updateAddress, String updateBirthDate, String updateEmail) {

    }

    //    public void updateContact() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter contact number: ");
//        String updatePhoneNumber = scanner.nextLine();
//        Contact updateContact = null;
//        for (Contact contact : contacts) {
//            if (contact.getPhoneNumber().equals(phoneNumber)) {
//                updateContact = contact;
//                break;
//            }
//        }
//        if (updateContact == null) {
//            System.out.println("Contact not found");
//            return;
//        }
//        System.out.println("Update Contact ");
//        System.out.println("Update New Contact ");
//        updateContact.setPhoneNumber(updatePhoneNumber);
//        updateContact.setEmail(updatePhoneNumber);
//        updateContact.setName(updatePhoneNumber);
//        updateContact.setAddress(updatePhoneNumber);
//        updateContact.setBirthday(updatePhoneNumber);
//        updateContact.setGender(updatePhoneNumber);
//
//    }
    public void deleteContact(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
        System.out.println("Deleted contact");
    }

    public void searchContact(String query) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(query) || contact.getName().toLowerCase().contains(query.toLowerCase())) {
                System.out.println(contact);
            }
        }
        System.out.println("Contact found");
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("Contact not found. You need to add a contact or Load From File first. ");
        }
        Scanner scanner = new Scanner(System.in);
        int showPageSize = 5;
        int totalContacts = contacts.size();
        for (int i = 0; i < totalContacts; i++) {
            System.out.println(contacts.get(i));
            if ((i + 1) % showPageSize == 0 && (i + 1) < totalContacts) {
                System.out.println("Press Enter to continue");
                scanner.nextLine();
            }
        }
        System.out.println("Back to main menu");
    }

    public void sortContacts() {
        contacts.sort(Comparator.comparing(Contact::getName));
    }

    public void loadFromFile() {
        //Check file exist or not?
        System.out.println("File does it exist? " + new File(FILE_PATH).exists());
        System.out.println("The file has " + new File(FILE_PATH).length() + " bytes");
        //warning ở đây
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cảnh báo: Lựa chọn “Đọc từ File” sẽ thực hiện xoá toàn bộ danh bạ đang có trong bộ nhớ.");
        System.out.println("Bạn có chắc chắn muốn tiếp tục? (Có/Không)");
        String confirm = scanner.nextLine().trim().toLowerCase();
        if (confirm.equals("không")) {
            System.out.println("Huỷ bỏ việc đọc file.");
            return;
        }
        //reset dữ liệu trong lịch sử
        contacts.clear();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {

            String line = null;
            boolean firstLine = true;
            while ((line = br.readLine()) != null) {
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

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            bw.write("PhoneNumber,Group,Name,Gender,Address,BirthDate,Email");
            bw.newLine();
            for (Contact contact : contacts) {
                bw.write(contact.toCSV());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());
            e.printStackTrace();
        }
    }


}
