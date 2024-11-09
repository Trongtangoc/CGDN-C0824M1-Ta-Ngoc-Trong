package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class FindMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo mảng số nguyên với SIZE phần tử
        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int SIZE = scanner.nextInt();
        int[] arr = new int[SIZE];

        // Bước 2: Nhập giá trị cho các phần tử trong mảng từ bàn phím
        System.out.println("Nhập các phần tử trong mảng:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Bước 3: Gọi phần tử đầu tiên trong mảng là phần tử có giá trị nhỏ nhất
        int min = arr[0];

        // Bước 4: Duyệt mảng từ phần tử thứ 2 đến hết mảng
        for (int i = 1; i < SIZE; i++) {
            // So sánh phần tử tiếp theo với giá trị nhỏ nhất
            if (arr[i] < min) {
                min = arr[i];  // Cập nhật giá trị nhỏ nhất nếu tìm thấy phần tử nhỏ hơn
            }
        }

        // Bước 5: Kết thúc duyệt mảng. In ra giá trị nhỏ nhất.
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);

        scanner.close();
    }
}
