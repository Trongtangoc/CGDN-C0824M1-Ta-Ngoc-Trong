package ss1_Introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndexBMI {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.print("Enter the weight in kilograms: ");
        weight = scanner.nextDouble();

        System.out.print("Enter the height in meters: ");
        height = scanner.nextDouble();

        bmi = weight / (height * height);
        System.out.printf("%-20s%s", "bmi", "Interpretation ");

        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");

        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "Normal");
        } else if (bmi < 35.0) {
            System.out.printf("%-20.2f%s", bmi, "Overweight");

        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}
