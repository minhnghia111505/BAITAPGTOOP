package chuong2;

import java.util.Scanner;
public class Bai24 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số lượng sinh viên
	        System.out.print("Nhập số lượng sinh viên trong lớp: ");
	        int n = scanner.nextInt();

	        // Khai báo mảng lưu điểm của sinh viên
	        int[] diem = new int[n];

	        // Nhập điểm cho từng sinh viên
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhập điểm thi tiếng Anh của sinh viên thứ " + (i + 1) + ": ");
	            diem[i] = scanner.nextInt();
	        }

	        // Nhập điểm cần tìm
	        System.out.print("Nhập điểm cần tìm: ");
	        int diemCanTim = scanner.nextInt();

	        // Tìm sinh viên có điểm bằng điểm vừa nhập
	        boolean timThay = false;
	        System.out.println("Danh sách sinh viên có điểm bằng " + diemCanTim + ":");
	        for (int i = 0; i < n; i++) {
	            if (diem[i] == diemCanTim) {
	                System.out.println("Sinh viên thứ " + (i + 1) + " có điểm: " + diem[i]);
	                timThay = true;
	            }
	        }

	        // Nếu không tìm thấy sinh viên nào
	        if (!timThay) {
	            System.out.println("Không có sinh viên nào có điểm bằng " + diemCanTim);
	        }

	        scanner.close();
	    }
}

