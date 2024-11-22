package bai10;

public class Test {
	public static void main(String[] args) {
		// Tạo đối tượng HocVienDH (học viên đồ họa)
		HocVienDH hocVienDH = new HocVienDH("Nguyen Van A", "Hà Nội", 1, "Đồ họa", 10);
		hocVienDH.nhapThongTinHocVienDH();
		System.out.println("Thông tin học viên Đồ họa:");
		hocVienDH.inThongTin();

		// Tạo đối tượng HocVienLT (học viên lập trình)
		HocVienLT hocVienLT = new HocVienLT("Tran Thi B", "TP.HCM", 2, "Lập trình", 15);
		hocVienLT.nhapThongTinHocVienLT();
		System.out.println("\nThông tin học viên Lập trình:");
		hocVienLT.inThongTin();
	}
}
