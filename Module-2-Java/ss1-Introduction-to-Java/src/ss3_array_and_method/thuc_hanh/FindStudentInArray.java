package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindStudentInArray {
    public static void main(String[] args) {
        String[] students = {"Nhung", "Linh", "Ngan", "Diem", "Binh", "Trung", "Na"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        String inputName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(inputName)) {
                System.out.println("Position of the " + students[i] + " is " + i);
                found = true;
                break;
            }

        }
        if (!found) {
            System.out.println("Student not found");
        }
    }
}
