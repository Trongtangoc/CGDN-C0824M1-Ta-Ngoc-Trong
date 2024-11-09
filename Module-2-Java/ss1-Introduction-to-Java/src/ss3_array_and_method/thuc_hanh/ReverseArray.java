package ss3_array_and_method.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("The size of the array is greater than 20");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter the element: " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("The array is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
        //reverse array
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[array.length - j - 1];
            array[array.length - j - 1] = temp;
        }
        System.out.print("The array Reverse is: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }

    }

}
