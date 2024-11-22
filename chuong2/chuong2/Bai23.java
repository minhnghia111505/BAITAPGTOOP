package chuong2;

import java.util.Scanner;

public class Bai23 {

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

		// Tìm điểm cao nhất và chỉ số sinh viên có điểm cao nhất
		int maxDiem = diem[0];
		int indexMax = 0;
		for (int i = 1; i < n; i++) {
			if (diem[i] > maxDiem) {
				maxDiem = diem[i];
				indexMax = i;
			}
		}

		// Sắp xếp tăng dần (sử dụng thuật toán sắp xếp nổi bọt - BubbleSort)
		
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (diem[j] > diem[j + 1]) {

					int temp = diem[j];
					diem[j] = diem[j + 1];
					diem[j + 1] = temp;
				}
			}
		}

		// In kết quả
		System.out.println("Điểm cao nhất: " + maxDiem);
		System.out.println("Sinh viên có điểm cao nhất là sinh viên thứ " + (indexMax + 1));
		System.out.print("Danh sách điểm theo thứ tự tăng dần: ");
		for (int i = 0; i < n; i++) {
			System.out.print(diem[i] + " ");
		}

		scanner.close();
	}
}
