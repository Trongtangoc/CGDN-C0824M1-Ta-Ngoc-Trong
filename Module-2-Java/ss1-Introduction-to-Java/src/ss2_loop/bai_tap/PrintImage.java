package ss2_loop.bai_tap;

import java.util.Scanner;

public class PrintImage {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i = 1; i <= 3; i++) {
                        System.out.print("*");
                        for (int j = 1; j <= 7; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i <= 5; i++) {
                        System.out.print("*");
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    for (int i = 1; i <= 5;i++){
                        System.out.print("*");
                        for (int j = 5; j > i ; j--) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                        break;
                case 3:
                    System.out.println("Print isosceles triangle");
                    for (int i = 0; i < 5; i++) {
                        // In khoảng trắng trước các dấu *
                        for (int j = 0; j < 5 - i - 1; j++) {
                            System.out.print(" ");
                        }

                        // In các dấu * cho mỗi hàng
                        for (int k = 0; k < 2 * i + 1; k++) {
                            System.out.print("*");
                        }

                        // Xuống dòng sau mỗi hàng
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
