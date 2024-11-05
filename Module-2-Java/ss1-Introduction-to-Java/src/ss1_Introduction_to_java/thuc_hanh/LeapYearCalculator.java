package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int year;
        System.out.print("Enter the year: ");
        year = scanner.nextInt();


        // Cach 1 kiem tra nam nhuan
//            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//                System.out.printf("%d is a Leap year", year);
//            }
//            else {
//                System.out.printf("%d is not leap year.", year);
//            }
        //Cach 2 kiem tra nam nhuan
        boolean isLeap = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        boolean isLeapYear = false;

        if (isLeap) {
            isLeapYear = true;
        } else {
            isLeapYear = false;
        }
        if(isLeapYear){
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
