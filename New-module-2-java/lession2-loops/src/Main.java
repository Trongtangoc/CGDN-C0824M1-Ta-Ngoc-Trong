import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("\t1. Print the rectangle");
        System.out.println("\t2. Print the square triangle1");
        System.out.println("\t3. Print the square triangle2");
        System.out.println("\t4. Print the circle");
        System.out.println("\t5. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice [1-5]: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printRectangle();
                break;
            case 2:
                printSquare1();
                break;
            case 3:
                printSquare2();
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
    private static void printSquare1() {
        for (int i = 0;i < 7;i++){
            for (int j = 1; j < i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void printSquare2() {
        for (int i = 5;i >= 1;i--){
            for (int j = 1; j <= i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}