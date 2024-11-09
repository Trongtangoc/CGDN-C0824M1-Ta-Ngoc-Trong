package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class MatrixMaxElementInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Thu thập kích thước ma trận từ người dùng
        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int cols = scanner.nextInt();

        // Khai báo ma trận
        double[][] matrix = new double[rows][cols];

        // Bước 2: Nhập giá trị cho các phần tử trong ma trận từ người dùng
        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Nhập phần tử tại vị trí [" + (i + 1) + "][" + (j + 1) + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Khai báo biến để chứa giá trị lớn nhất và tọa độ của nó
        double maxValue = matrix[0][0];
        int maxRow = 0;
        int maxCol = 0;

        // Duyệt qua tất cả các phần tử trong ma trận để tìm giá trị lớn nhất
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        // Thông báo kết quả
        System.out.println("Phần tử lớn nhất trong ma trận là " + maxValue);
        System.out.println("Vị trí của phần tử lớn nhất: dòng " + (maxRow + 1) + ", cột " + (maxCol + 1));

        scanner.close();
    }
}
