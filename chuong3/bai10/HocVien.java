package bai10;

import java.util.Scanner;

public abstract class HocVien {
	protected String hoTen;
	protected String diaChi;
	protected int loaiUuTien; // Loại ưu tiên 1 hoặc 2
	protected String loaiChuongTrinh; // Chương trình học (Đồ họa hoặc Lập trình)

	public HocVien(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh) {
		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiUuTien = loaiUuTien;
		this.loaiChuongTrinh = loaiChuongTrinh;
	}

	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập địa chỉ: ");
		diaChi = scanner.nextLine();
		System.out.print("Nhập loại ưu tiên (1 hoặc 2): ");
		loaiUuTien = scanner.nextInt();
		scanner.nextLine(); // Đọc dòng mới sau khi nhập số
		System.out.print("Nhập loại chương trình (Đồ họa hoặc Lập trình): ");
		loaiChuongTrinh = scanner.nextLine();
	}

	public abstract double hocPhi();

	public void inThongTin() {
		System.out.println("Họ tên: " + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
		System.out.println("Loại ưu tiên: " + loaiUuTien);
		System.out.println("Loại chương trình: " + loaiChuongTrinh);
		System.out.println("Học phí: " + hocPhi() + " VNĐ");
	}
}
