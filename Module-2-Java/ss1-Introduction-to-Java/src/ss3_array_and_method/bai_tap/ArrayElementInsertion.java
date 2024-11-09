package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class ArrayElementInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.print("Nhập số phần tử của mảng N: ");
        int N = scanner.nextInt();
        int[] array = new int[N + 1]; // Tạo mảng lớn hơn 1 phần tử để có thể chèn vào

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là số cần chèn
        System.out.print("Nhập số cần chèn X: ");
        int X = scanner.nextInt();

        // Bước 3: Nhập vào vị trí index cần chèn X vào trong mảng
        System.out.print("Nhập vị trí cần chèn (index): ");
        int index = scanner.nextInt();

        // Bước 4: Kiểm tra tính hợp lệ của vị trí chèn
        if (index < 0 || index > N) {
            System.out.println("Không thể chèn phần tử vào vị trí này.");
        } else {
            // Bước 5: Thực hiện chèn phần tử X ở vị trí index vào mảng
            for (int i = N; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = X;

            // Bước 6: In ra mảng sau khi chèn
            System.out.print("Mảng sau khi chèn: ");
            for (int i = 0; i <= N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
