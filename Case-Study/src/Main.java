import com.sun.security.jgss.GSSUtil;

import java.awt.*;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerContact manager = new ManagerContact();
        while (true) {
            System.out.println("---CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ---");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Sửa");
            System.out.println("4. Xoá");
            System.out.println("5. Tìm kiếm");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Đọc từ file");
            System.out.println("8. Ghi vào file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            //"2. Thêm mới");  System.out.println("8. Ghi vào file"); ("7. Đọc từ file");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    manager.getList();
                    break;
                case 2:
                    System.out.print("Nhập số điện thoại: ");
                    String phone = scanner.nextLine();
                    System.out.print("Nhập nhóm: ");
                    String group = scanner.nextLine();
                    System.out.print("Nhập họ tên: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giới tính: ");
                    String gender = scanner.nextLine();
                    System.out.print("Nhập địa chỉ: ");
                    String address = scanner.nextLine();
                    System.out.print("Nhập ngày sinh: ");
                    String birthDate = scanner.nextLine();
                    System.out.print("Nhập email: ");
                    String email = scanner.nextLine();
                    manager.add(new Contact(phone, group, name, gender, address, birthDate, email));
                    System.out.println("Đã thêm vào danh bạ");

                    break;
                case 3:
                    // Sửa danh bạ (cập nhật)
                    System.out.print("Nhập số điện thoại danh bạ cần sửa: ");
                    String phoneUpdate = scanner.nextLine();
                    Contact updateContact = findContactByPhone(manager, phoneUpdate);
                    if (updateContact == null) {
                        System.out.println("Không tìm thấy danh bạ với số ĐT: " + phoneUpdate);
                        break;
                    }

                    Contact updatedInfo = inputContact(scanner);

                    if (updatedInfo != null) {
                        updatedInfo.setPhoneNumber(phoneUpdate);
                        manager.update(updatedInfo);
                        System.out.println("Cập nhật thành công!");
                    }
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xoá: ");
                    String phoneRemove = scanner.nextLine();
                    Contact removeContact = new Contact();
                    removeContact.setPhoneNumber(phoneRemove);
                    manager.remove(removeContact);
                    break;


                case 5:
                    System.out.print("Nhập số điện thoại hoặc họ tên để tìm kiếm: ");
                    String keyWord = scanner.nextLine();
                    Contact searchContact = new Contact();
                    searchContact.setPhoneNumber(keyWord);
                    manager.search(searchContact);
                    break;
                case 6:
                    manager.sort(manager.getList());
                    // Xem danh sách sau khi sắp xếp
                    manager.displayContacts();
                    break;

                case 7:
                    manager.readCSV();
                    break;
                case 8:
                    manager.writeCSV();
                    break;
                case 0:
                    scanner.close();
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng nhập lại");
            }
        }
    }

    private static Contact inputContact(Scanner sc) {
        try {
            System.out.print("Nhóm mới: ");
            String group = sc.nextLine();
            System.out.print("Số ĐT mới: ");
            String phone = sc.nextLine();
            System.out.print("Họ tên mới: ");
            String name = sc.nextLine();
            System.out.print("Giới tính mới: ");
            String gender = sc.nextLine();
            System.out.print("Địa chỉ mới: ");
            String address = sc.nextLine();
            System.out.print("Ngày sinh mới: ");
            String dateOfBirth = sc.nextLine();
            System.out.print("Email mới: ");
            String email = sc.nextLine();
            return new Contact(phone, group, name, gender, address, dateOfBirth, email);
        } catch (Exception e) {
            System.out.println("Lỗi khi nhập Contact: " + e.getMessage());
            return null;
        }
    }

    private static Contact findContactByPhone(ManagerContact manager, String phoneUpdate) {
        for (Contact contact : manager.getList()) {
            if (contact.getPhoneNumber().equals(phoneUpdate)) {
                return contact;
            }
        }
        return null;
    }
}
