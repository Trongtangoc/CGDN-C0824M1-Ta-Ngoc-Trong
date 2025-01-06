import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("\t1. Print the rectangle");
        System.out.println("\t2. Print the square triangle");
        System.out.println("\t3. Print the circle");
        System.out.println("\t4. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice [1-4]: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printRectangle();
                break;
            case 2:
                break;
            case 3:
                  break;
            case 4:
                break;
                default:
                    System.out.println("Invalid choice");

        }
    }

    private static void printRectangle() {
        for (int i = 0;i < 3;i++){
            for (int j = 0; j < 7;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}