import com.sun.security.jgss.GSSUtil;

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
            System.out.println("7. Ghi vào file");
            System.out.println("8. Đọc từ file");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    manager.displayContacts();
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
                    manager.addContact(new Contact(phone, group, name, gender, address, birthDate, email));
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Nhập số điện thoại cần cập nhật: ");
                    String updatePhone = scanner.nextLine();
                    System.out.print("Nhập nhóm mới: ");
                    String updateGroup = scanner.nextLine();
                    System.out.print("Nhập họ tên mới: ");
                    String updateName = scanner.nextLine();
                    System.out.print("Nhập giới tính mới: ");
                    String updateGender = scanner.nextLine();
                    System.out.print("Nhập địa chỉ mới: ");
                    String updateAddress = scanner.nextLine();
                    System.out.print("Nhập ngày sinh mới: ");
                    String updateBirthDate = scanner.nextLine();
                    System.out.print("Nhập email mới: ");
                    String updateEmail = scanner.nextLine();
                    manager.updateContact(updatePhone, updateGroup, updateName, updateGender, updateAddress, updateBirthDate, updateEmail);
                    break;
                case 4:
                    System.out.print("Nhập số điện thoại cần xoá: ");
                    String deletePhone = scanner.nextLine();
                    manager.deleteContact(deletePhone);
                    break;
                case 5:
                    System.out.print("Nhập số điện thoại hoặc họ tên để tìm kiếm: ");
                    manager.searchContact(scanner.nextLine());
                    break;
                case 6:
                    manager.sortContacts();
                    break;
                case 7:
                    manager.loadFromFile();
                    break;
                case 8:
                    manager.saveToFile();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Chọn sai, vui lòng nhập lại");
            }
        }
    }
}
