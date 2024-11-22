package bai5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập lương từ người dùng
            System.out.print("Nhập lương của người (với giá trị từ 5.000.000 đến 20.000.000): ");
            long luong = scanner.nextLong();

            // Kiểm tra phạm vi lương
            if (luong < 5000000 || luong > 20000000) {
                // Nếu lương nằm ngoài phạm vi cho phép, ném ngoại lệ
                throw new OutOfRangeException("Lỗi: Lương phải nằm trong phạm vi từ 5.000.000 đến 20.000.000.");
            }

            // Nếu lương hợp lệ, hiển thị lương
            System.out.println("Lương của người nhập vào là: " + luong);

        } catch (OutOfRangeException e) {
            // Xử lý ngoại lệ và hiển thị thông báo lỗi
            System.out.println(e.getMessage());
        } catch (Exception e) {
            // Xử lý ngoại lệ khác (nếu có)
            System.out.println("Lỗi: Dữ liệu nhập vào không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
