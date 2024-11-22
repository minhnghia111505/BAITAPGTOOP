package chuong2;
import java.util.Scanner;
public class Bai14 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int soDien = scanner.nextInt();

        double tongTien = 0;

        if (soDien <= 50) {
            tongTien = soDien * 1484;  // Đơn giá cho từ 0 đến 50 kWh
        } else if (soDien <= 100) {
            tongTien = 50 * 1484 + (soDien - 50) * 1533;  // Đơn giá cho từ 51 đến 100 kWh
        } else if (soDien <= 200) {
            tongTien = 50 * 1484 + 50 * 1533 + (soDien - 100) * 1786;  // Đơn giá cho từ 101 đến 200 kWh
        } else {
            tongTien = 50 * 1484 + 50 * 1533 + 100 * 1786 + (soDien - 200) * 2242;  // Đơn giá cho từ 201 kWh trở đi
        }

        System.out.println("Số tiền phải thanh toán trong tháng là: " + tongTien);

        scanner.close();
    }
}
