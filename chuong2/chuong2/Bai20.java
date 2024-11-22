package chuong2;
import java.util.Scanner;
public class Bai20 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập nhiệt độ °C
        System.out.print("Nhập nhiệt độ (°C): ");
        double celsius = scanner.nextDouble();

        // Chuyển đổi °C sang °F
        double fahrenheit = celsius * 1.8 + 32;

        // Hiển thị kết quả
        System.out.println("Nhiệt độ tương ứng ở độ F là: " + fahrenheit);

        scanner.close();
    }
}
