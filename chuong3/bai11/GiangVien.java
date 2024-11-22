package bai11;

import java.util.Scanner;

public abstract class GiangVien {
	protected String hoTen;
	protected String diaChi;
	protected String loaiGiangVien;

	public GiangVien() {

	}

	public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {

		this.hoTen = hoTen;
		this.diaChi = diaChi;
		this.loaiGiangVien = loaiGiangVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getLoaiGiangVien() {
		return loaiGiangVien;
	}

	public void setLoaiGiangVien(String loaiGiangVien) {
		this.loaiGiangVien = loaiGiangVien;
	}

// phương thúc trừu tượng để tính lương
	public abstract double tinhLuong();
// phương thức nhâp thông tin
	public void nhapThongTin() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập họ tên: ");
		hoTen = scanner.nextLine();
		System.out.print("Nhập địa chỉ: ");
        diaChi = scanner.nextLine();
        System.out.print("Nhập loại giảng viên (Cơ hữu hoặc Thỉnh giảng): ");
        loaiGiangVien = scanner.nextLine();
	}
// phương thúc in thông tin
	public void inThongTin() {
		System.out.println("Họ tên:" + hoTen);
		System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại giảng viên: " + loaiGiangVien);
        System.out.println("Lương tháng: " + tinhLuong() + " VNĐ");
	}
}
