package ss1_Introduction_to_java.Bai_tap;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        // Bước 2: Khai báo biến tỉ giá
        double rate = 23000.0; // Tỉ giá 23000 VND/USD

        // Bước 3: Khai báo biến giá trị USD và cho người dùng nhập vào
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền USD cần đổi: ");
        double usd = scanner.nextDouble();

        // Bước 4: Tính giá trị VND và hiển thị ra màn hình
        double vnd = usd * rate;
        System.out.printf("%.2f USD tương đương với %.2f VND\n", usd, vnd);

        scanner.close();
    }
}
