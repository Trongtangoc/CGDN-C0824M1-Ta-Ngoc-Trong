import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//implements IManager<Contact>
public class ManagerContact implements IManager<Contact> {

    private static final String FILE_PATH = "src/data/contacts.csv";
    private List<Contact> contacts;

    public ManagerContact() {
        contacts = new ArrayList<>();
    }

    @Override
    public List<Contact> getList() {
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

        return contacts;

    }

    @Override
    public void add(Contact contact) {

    }

    @Override
    public void update(Contact contact) {

    }

    @Override
    public void remove(Contact contact) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
        System.out.println("Deleted contact");

    }

    @Override
    public void search(Contact findContact) {
        String keyword = findContact.getPhoneNumber();
        List<Contact> results = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().contains(keyword) || contact.getName().toLowerCase().contains(keyword)) {
                results.add(contact);
            }
        } if (results.isEmpty()) {
            System.out.println("Contact not found");
        } else {
            System.out.println("Found " + results.size() + " contacts");
            for (Contact contact : results) {
                System.out.println(contact);
            }
        }

    }

    @Override
    public void sort(List<Contact> list) {

    }

    @Override
    public void writeCSV() {

        String COMMA_DELIMITER = ",";
        try {
            FileWriter fileWriter = new FileWriter(FILE_PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Contact contact : contacts) {
                bufferedWriter.write(contact.getPhoneNumber() + COMMA_DELIMITER + contact.getGroup() + COMMA_DELIMITER + contact.getName() + COMMA_DELIMITER + contact.getGender() + COMMA_DELIMITER + contact.getAddress() + COMMA_DELIMITER + contact.getDateOfBirth() + COMMA_DELIMITER + contact.getEmail());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<Contact> readCSV() {
        System.out.println("File does it exist? " + new File(FILE_PATH).exists());
        System.out.println("The file has " + new File(FILE_PATH).length() + " bytes");

        List<Contact> contacts = new ArrayList<Contact>();
        String COMMA = ",";
        try {
            FileReader fileReader = new FileReader(FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            Scanner scanner = new Scanner(bufferedReader);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] data = line.split(COMMA);
                Contact contact = new Contact();
                contact.setPhoneNumber(data[0]);
                contact.setGroup(data[1]);
                contact.setName(data[2]);
                contact.setGender(data[3]);
                contact.setAddress(data[4]);
                contact.setDateOfBirth(data[5]);
                contact.setEmail(data[6]);
                contacts.add(contact);
            }
            System.out.println("Read " + contacts.size() + " contacts");
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contacts;
    }

    @Override
    public void clear() {

    }

    public void addContact(Contact contact) {
        if (!isValidPhoneNumber(contact.getPhoneNumber())) {
            throw new IllegalArgumentException("Invalid phone number or email");
        }
        contacts.add(contact);
        System.out.println("Contact added");
    }

    public static String promptForPhoneNumber(Scanner scanner) {

        while (true) {
            System.out.println("Please enter a valid phone number: ");
            String phoneNumber = scanner.next();
            try {
                if (isValidPhoneNumber(phoneNumber)) {
                    return phoneNumber;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid phone number in promptForPhoneNumber Class ManagerContact. Please enter a valid phone number");
            }
        }
    }

    //    private boolean isValidEmail(String email) {
//        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
//        System.out.println("Invalid email in Class Contact");
//    }
    private static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length() < 10 || phoneNumber.length() > 11) {
            return false;
        } else {
            return phoneNumber.matches("^[0-9]{10}$");
        }
    }


    public void updateContact(Contact newInfo) {
        for (Contact contact : contacts) {
            if (contact.getPhoneNumber().equals(newInfo.getPhoneNumber())) {
                contact.setGroup(newInfo.getGroup());
                contact.setName(newInfo.getName());
                contact.setGender(newInfo.getGender());
                contact.setAddress(newInfo.getAddress());
                contact.setDateOfBirth(newInfo.getDateOfBirth());
                contact.setEmail(newInfo.getEmail());
                break;
            }
        }

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
//                Contact contact = Contact.fromCSV(line);
//                if (contact != null) {
//                    contacts.add(contact);
//                }
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
//                bw.write(contact.toCSV());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());
            e.printStackTrace();
        }
    }


}
