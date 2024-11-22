package bai1;

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Nhập số thứ nhất
            System.out.print("Nhập số nguyên thứ nhất: ");
            int num1 = scanner.nextInt();
            
            // Nhập số thứ hai
            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = scanner.nextInt();
            
            // Thực hiện phép chia
            int result = num1 / num2;
            System.out.println("Kết quả của " + num1 + " chia cho " + num2 + " là: " + result);
            
        } catch (Exception e) {
            // Xử lý ngoại lệ khi mẫu số bằng 0
            System.out.println("Lỗi: Không thể chia cho 0!");
        }  finally {
            scanner.close();
        }
    }
}
