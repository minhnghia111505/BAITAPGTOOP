package bai11;

public class Test {
	public static void main(String[] args) {
		// tạo đối tượng giảng viên thỉnh giảng
		GVThinhGiang gvThinhGiang = new GVThinhGiang("Nguyen Van A", "Hà Nội", "Thỉnh giảng", 20);
		gvThinhGiang.nhapThongTinGVThinhGiang();
		System.out.println("\nThông tin Giảng viên thỉnh giảng:");
		gvThinhGiang.inThongTin();

		// tạo đối tượng gv cơ hữu
		GVCoHuu gvCoHuu = new GVCoHuu("Tran Thi B", "TP.HCM", "Cơ hữu", 23);
		gvCoHuu.nhapThongTinGVCoHuu();
		System.out.println("\n Thông tin gv cơ hữu:");
		gvCoHuu.inThongTin();
	}
}
