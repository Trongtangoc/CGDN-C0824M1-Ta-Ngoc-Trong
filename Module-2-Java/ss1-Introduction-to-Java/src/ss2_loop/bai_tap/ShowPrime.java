package ss2_loop.bai_tap;

import java.math.BigInteger;
import java.util.Scanner;

public class ShowPrime {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number Prime you want: ");
        number = input.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}







