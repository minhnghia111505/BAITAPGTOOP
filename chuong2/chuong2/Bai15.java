package chuong2;
import java.util.Scanner;
public class Bai15 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số ngày lưu trú: ");
        int soNgay = scanner.nextInt();

        System.out.print("Nhập đơn giá mỗi ngày: ");
        double donGia = scanner.nextDouble();

        double tongTien = 0;

        // Tính tiền phòng dựa vào số ngày và mức giảm giá
        if (soNgay == 1) {
            tongTien = donGia;  // Đơn giá cho 1 ngày
        } else if (soNgay >= 2 && soNgay <= 4) {
            tongTien = soNgay * donGia * 0.8;  // Giảm 20% cho từ ngày thứ 2 đến ngày thứ 4
        } else if (soNgay >= 5 && soNgay <= 10) {
            tongTien = soNgay * donGia * 0.6;  // Giảm 40% cho từ ngày thứ 5 đến ngày thứ 10
        } else if (soNgay > 10) {
            tongTien = soNgay * donGia * 0.4;  // Giảm 60% cho từ ngày thứ 11 trở đi
        }

        System.out.println("Tiền phòng phải thanh toán là: " + tongTien);

        scanner.close();
    }
}
