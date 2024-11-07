package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class ConvertVNDtoUSD {
    public static void main(String[] args) {
        double rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the currency USD: ");
        double currentUSD = scanner.nextDouble();
        double VND = ((currentUSD * rate) / 1);
        System.out.println("The VND value is: " + VND);
    }


}
