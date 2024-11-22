package chuong2;
import java.util.Scanner;
public class Bai13 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập giá bán của sản phẩm: ");
	        double giaBan = scanner.nextDouble();

	        System.out.print("Nhập phần trăm giảm giá: ");
	        double phanTramGiam = scanner.nextDouble();

	        // Tính số tiền giảm giá
	        double soTienGiam = giaBan * phanTramGiam / 100;

	        // Tính giá bán sau khi giảm
	        double giaBanSauKhiGiam = giaBan - soTienGiam;

	        System.out.println("Giá bán sau khi giảm là: " + giaBanSauKhiGiam);

	        scanner.close();
	    }
}
