package bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Nhập dữ liệu ngày, tháng, năm
            System.out.print("Nhập ngày: ");
            int ngay = scanner.nextInt();

            System.out.print("Nhập tháng: ");
            int thang = scanner.nextInt();

            System.out.print("Nhập năm: ");
            int nam = scanner.nextInt();

            // Tạo đối tượng ThoiGian và kiểm tra ngoại lệ
            ThoiGian thoiGian = new ThoiGian(ngay, thang, nam);
            thoiGian.hienThi();

        } catch (InvalidDateException e) {
            // Hiển thị thông báo lỗi khi xảy ra ngoại lệ
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            // Xử lý ngoại lệ khác
            System.out.println("Lỗi: Dữ liệu nhập vào không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
