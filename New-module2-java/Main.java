import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            if(number == 0){
                break;
            }
        }

    }
}
