import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Contact {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String dateOfBirth;
    private String email;

    public Contact() {

    }

    public Contact(String phoneNumber,
                   String group,
                   String name,
                   String gender,
                   String address,
                   String dateOfBirth,
                   String email) {

        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return phoneNumber + " - "
                + name + " - "
                + group + " - "
                + gender + " - "
                + address + " - "
                + dateOfBirth + " - "
                + email;

    }

    public static Contact fromCSV(String line) {
        String COMMA = ",";
        String[] data = line.split(COMMA);
        if (data.length < 7) {
            return null;
        }
        Contact contact = new Contact();
        contact.setPhoneNumber(data[0].trim());
        contact.setGroup(data[1].trim());
        contact.setName(data[2].trim());
        contact.setGender(data[3].trim());
        contact.setAddress(data[4].trim());
        contact.setDateOfBirth(data[5].trim());
        contact.setEmail(data[6].trim());
        return contact;
    }

    public String toCSV() {
        return String.join(",",
                phoneNumber,
                group,
                name,
                gender,
                address,
                dateOfBirth,
                email);
    }

}
//public void loadFromFile() {
//    //Check file exist or not?
//    System.out.println("File does it exist? " + new File(FILE_PATH).exists());
//    System.out.println("The file has " + new File(FILE_PATH).length() + " bytes");
//    //warning ở đây
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Cảnh báo: Lựa chọn “Đọc từ File” sẽ thực hiện xoá toàn bộ danh bạ đang có trong bộ nhớ.");
//    System.out.println("Bạn có chắc chắn muốn tiếp tục? (Có/Không)");
//    String confirm = scanner.nextLine().trim().toLowerCase();
//    if (confirm.equals("không")) {
//        System.out.println("Huỷ bỏ việc đọc file.");
//        return;
//    }
//    //reset dữ liệu trong lịch sử
//    contacts.clear();
//    try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
//        String line = null;
//        boolean firstLine = true;
//        while ((line = br.readLine()) != null) {
//            if (firstLine) {
//                firstLine = false;
//                continue;
//            }
////                Contact contact = Contact.fromCSV(line);
////                if (contact != null) {
////                    contacts.add(contact);
////                }
//        }
//        System.out.println("Read " + contacts.size() + " contacts");
//    } catch (IOException e) {
//        System.out.println("Error reading file: " + e.getMessage());
//    }
//}
