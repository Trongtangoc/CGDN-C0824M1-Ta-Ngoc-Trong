package ss1_Introduction_to_java.Bai_tap;

import java.util.Scanner;

public class TalkNumerToText {
        // Mảng cho các số hàng đơn vị và số đặc biệt (10 - 19)
    //test github
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên không âm có tối đa 3 chữ số: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(convertToWords(number));
        }

        scanner.close();
    }

    // Hàm chuyển đổi số thành chữ
    public static String convertToWords(int number) {
        if (number == 0) return "zero";
        if (number < 10) return ones[number];
        if (number < 20) return teens[number - 10];
        if (number < 100) return tensToWords(number);
        return hundredsToWords(number);
    }

    // Chuyển đổi số có hai chữ số từ 20 đến 99
    private static String tensToWords(int number) {
        int ten = number / 10;
        int one = number % 10;
        return tens[ten] + (one > 0 ? " " + ones[one] : "");
    }

    // Chuyển đổi số có ba chữ số
    private static String hundredsToWords(int number) {
        int hundred = number / 100;
        int remainder = number % 100;
        return ones[hundred] + " hundred" + (remainder > 0 ? " and " + convertToWords(remainder) : "");
    }
}
