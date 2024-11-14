package ss3_array_and_method.bai_tap;

import java.util.Scanner;

public class CountcharAtStr {
    public static void main(String[] args) {
        String str = "Day la mot chuoi";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ky tu can dem");
        char inputChar = sc.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == inputChar) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cuar ky tu " + inputChar + " trong chuoi la: " + count);

    }
}
