package bai4;

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
                // Kiểm tra nếu chuỗi dài hơn 20 ký tự
                if (input.length() > 20) {
                    // Ném ngoại lệ nếu chuỗi dài hơn 20 ký tự
                    throw new StringTooLongException("Lỗi: Chuỗi nhập vào có quá nhiều ký tự (quá 20 ký tự).");
                }
                System.out.println("Chuỗi nhập vào: " + input);
            } catch (StringTooLongException e) {
                // Hiển thị thông báo lỗi và tiếp tục chương trình
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
