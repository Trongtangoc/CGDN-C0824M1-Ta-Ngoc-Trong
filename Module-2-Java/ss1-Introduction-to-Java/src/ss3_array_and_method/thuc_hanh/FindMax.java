package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        size = sc.nextInt();

        do {
            if (size > 20) {
                System.out.println("Array need less than 20");
            }
        } while (size > 20);
        array = new int[size];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("This array list: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Maximum element is: " + max);

    }
}
