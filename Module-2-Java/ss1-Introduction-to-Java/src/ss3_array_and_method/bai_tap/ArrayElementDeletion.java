package ss3_array_and_method.bai_tap;
import java.util.Scanner;
public class ArrayElementDeletion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Khai báo và khởi tạo mảng số nguyên gồm N phần tử cho trước
        System.out.print("Nhập số phần tử của mảng N: ");
        int N = scanner.nextInt();
        int[] array = new int[N];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Nhập X là phần tử cần xoá
        System.out.print("Nhập giá trị X cần xoá: ");
        int X = scanner.nextInt();

        // Bước 3: Tìm X trong mảng
        int index_del = -1;
        for (int i = 0; i < N; i++) {
            if (array[i] == X) {
                index_del = i;
                break;
            }
        }

        // Nếu không tìm thấy X trong mảng
        if (index_del == -1) {
            System.out.println("Phần tử " + X + " không tồn tại trong mảng.");
        } else {
            // Bước 4: Thực hiện xoá phần tử X khỏi mảng
            for (int i = index_del; i < N - 1; i++) {
                array[i] = array[i + 1];
            }

            // Giảm kích thước mảng (N - 1)
            N--;

            // Bước 5: In ra mảng sau khi xoá phần tử
            System.out.print("Mảng sau khi xoá phần tử " + X + ": ");
            for (int i = 0; i < N; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
