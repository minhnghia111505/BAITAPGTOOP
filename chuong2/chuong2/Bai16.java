package chuong2;
import java.util.Scanner;
public class Bai16 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một số nguyên n: ");
        int n = scanner.nextInt();

      
        if (n < 0) {
            System.out.println("Giai thừa không xác định cho số âm.");
        } else {
          
            long giaiThua = 1;
            for (int i = 1; i <= n; i++) {
                giaiThua *= i;  
            }

            System.out.println("Giai thừa của " + n + " là: " + giaiThua);
        }

        scanner.close();
    }
}
