package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in); // khai bao doi tuong Scanner
        System.out.println("Enter the width of the rectangle ");
        width = scanner.nextFloat();

        System.out.println("Enter the height of the rectangle ");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("The area of the rectangle is " + area);
    }
}
