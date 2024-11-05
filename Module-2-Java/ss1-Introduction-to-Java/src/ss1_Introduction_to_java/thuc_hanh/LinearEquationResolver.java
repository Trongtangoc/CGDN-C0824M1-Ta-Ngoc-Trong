package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

// Giai phuong trinh bac nhat
public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter the third number c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);

        } else {
            if (b == c) {
                System.out.print("the solution is all x!");

            } else {
                System.out.print("No solution!");
            }
        }
    }
}
