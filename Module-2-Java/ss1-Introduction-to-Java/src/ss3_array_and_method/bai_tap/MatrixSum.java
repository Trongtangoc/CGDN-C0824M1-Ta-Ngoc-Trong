package ss3_array_and_method.bai_tap;
import java.util.Scanner;   
public class MatrixSum {

    // Bước 1: Viết hàm tính tổng các phần tử trên đường chéo chính
    public static int calculateDiagonalSum(int[][] matrix) {
        int sum = 0;
        int size = matrix.length; // Kích thước ma trận vuông

        // Duyệt qua các phần tử trên đường chéo chính
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];  // Cộng các phần tử có cùng chỉ số hàng và cột
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 2: Nhập kích thước ma trận vuông từ người dùng
        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        // Khai báo ma trận vuông với kích thước nhập từ người dùng
        int[][] matrix = new int[size][size];

        // Nhập các phần tử của ma trận từ người dùng
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Gọi hàm tính tổng các phần tử trên đường chéo chính
        int sum = calculateDiagonalSum(matrix);

        // Thông báo kết quả
        System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum);

        scanner.close();
    }
}
