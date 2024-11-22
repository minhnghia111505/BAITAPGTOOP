package chuong2;

import java.util.Scanner;

public class Bai22 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Nhập số phần tử của mảng
	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();

	        // Khai báo mảng số nguyên
	        int[] a = new int[n];

	        // Nhập giá trị cho từng phần tử trong mảng
	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhập giá trị phần tử thứ " + (i + 1) + ": ");
	            a[i] = scanner.nextInt();
	        }

	        // Hiển thị các phần tử trong mảng
	        System.out.println("Các phần tử trong mảng là:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(a[i] + " ");
	        }

	        scanner.close();
	    }
}
