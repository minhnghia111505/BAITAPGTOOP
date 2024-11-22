package bai3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Nhập chuỗi từ bàn phím
            System.out.print("Nhập chuỗi (hoặc nhập 'DONE' để kết thúc): ");
            String input = scanner.nextLine();

            // Kiểm tra nếu chuỗi là "DONE", kết thúc chương trình
            if (input.equalsIgnoreCase("DONE")) {
                break;
            }

            try {
                // Kiểm tra độ dài chuỗi
                if (input.length() > 30) {
                    // Ném ngoại lệ nếu chuỗi dài hơn 30 ký tự
                    throw new StringTooLongException("Lỗi: Chuỗi nhập vào có quá nhiều ký tự (quá 30 ký tự).");
                }
                System.out.println("Chuỗi nhập vào: " + input);
            } catch (StringTooLongException e) {
                // Xử lý ngoại lệ khi chuỗi dài quá 30 ký tự
                System.out.println(e.getMessage());
                break; // Kết thúc chương trình nếu có lỗi
            }
        }

        scanner.close();
    }
}