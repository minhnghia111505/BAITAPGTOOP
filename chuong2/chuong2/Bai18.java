package chuong2;
import java.util.Scanner;
public class Bai18 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập một số nguyên từ bàn phím
	        System.out.print("Nhập một số nguyên: ");
	        int n = scanner.nextInt();

	        // Kiểm tra số nguyên tố
	        if (n <= 1) {
	            System.out.println(n + " không phải là số nguyên tố.");
	        } else {
	            boolean laNguyenTo = true;

	            // Kiểm tra chia hết cho các số từ 2 đến √n
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    laNguyenTo = false;
	                    break;
	                }
	            }

	            // Kết quả
	            if (laNguyenTo) {
	                System.out.println(n + " là số nguyên tố.");
	            } else {
	                System.out.println(n + " không phải là số nguyên tố.");
	            }
	        }

	        scanner.close();
	    }
}
