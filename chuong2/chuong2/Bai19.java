package chuong2;
import java.util.Scanner;
public class Bai19 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số giờ: ");
	        int gio = scanner.nextInt();

	        System.out.print("Nhập số phút: ");
	        int phut = scanner.nextInt();

	        System.out.print("Nhập số giây: ");
	        int giay = scanner.nextInt();

	        int tongGiay = gio * 3600 + phut * 60 + giay;

	        System.out.println("Tổng số giây là: " + tongGiay);

	        scanner.close();
	    }
}
