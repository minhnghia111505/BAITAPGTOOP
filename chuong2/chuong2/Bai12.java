package chuong2;
import java.util.Scanner;
public class Bai12 {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập điểm thi của sinh viên
	        System.out.print("Nhập điểm thi của sinh viên (từ 0 đến 100): ");
	        double diem = scanner.nextDouble();

	        // Kiểm tra và hiển thị xếp loại
	        if (diem >= 90 && diem <= 100) {
	            System.out.println("Xếp loại: A");
	        } else if (diem >= 80 && diem < 90) {
	            System.out.println("Xếp loại: B");
	        } else if (diem >= 70 && diem < 80) {
	            System.out.println("Xếp loại: C");
	        } else if (diem >= 50 && diem < 70) {
	            System.out.println("Xếp loại: D");
	        } else if (diem < 50 && diem >= 0) {
	            System.out.println("Xếp loại: F");
	        } else {
	            System.out.println("Điểm nhập không hợp lệ. Vui lòng nhập điểm trong khoảng từ 0 đến 100.");
	        }

	        scanner.close();
	    }
}
