package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Hello: " + name);

    }
}
