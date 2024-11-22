package chuong2;

public class Bai17 {
	public static void main(String[] args) {
        System.out.println("Các số có 3 chữ số thỏa mãn điều kiện a² + b² + c² = 100 là:");

        // Duyệt qua tất cả các số có 3 chữ số
        for (int i = 100; i <= 999; i++) {
            // Tách từng chữ số
            int a = i / 100;          // Chữ số hàng trăm
            int b = (i / 10) % 10;    // Chữ số hàng chục
            int c = i % 10;           // Chữ số hàng đơn vị

            // Kiểm tra điều kiện
            if (a * a + b * b + c * c == 100) {
                System.out.println(i);
            }
        }
    }
}
