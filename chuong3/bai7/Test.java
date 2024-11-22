package bai7;

public class Test {
	public static void main(String[] args) {
		// khởi tạo đối tượng ResizableCircle với bán kính bằng 10
		ResizableCircle resizableCircle = new ResizableCircle(10.0);

		// hiển thị các thông tin ban đầu
		/**
		 * getRadius(): Lấy bán kính ban đầu của hình tròn. Perimeter(): Tính và hiển
		 * thị chu vi ban đầu của hình tròn dựa trên bán kính. Area(): Tính và hiển thị
		 * diện tích ban đầu của hình tròn dựa trên bán kính.
		 * 
		 */
		System.out.println("Initial radius: " + resizableCircle.getRadius());
		System.out.println("Initial perimeter: " + resizableCircle.Perimeter());
		System.out.println("Initial area: " + resizableCircle.Area());

		// thay đổi bán kính của hình tròn
		/**
		 * resizePercentage được đặt là 50, nghĩa là bán kính sẽ tăng lên 50%.
		 * resize(int percent): Phương thức này thay đổi bán kính của hình tròn theo tỷ
		 * lệ phần trăm chỉ định.
		 */
		int resizePercentage = 50; // Increase radius by 50%
		resizableCircle.resize(resizePercentage);

		// hiển thị cá thông tin sau khi thay đổi
		System.out.println("\nAfter resizing by " + resizePercentage + "%:");
		System.out.println("New radius: " + resizableCircle.getRadius());
		System.out.println("New perimeter: " + resizableCircle.Perimeter());
		System.out.println("New area: " + resizableCircle.Area());
	}

}
