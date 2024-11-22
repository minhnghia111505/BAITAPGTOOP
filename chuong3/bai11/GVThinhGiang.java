package bai11;

import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	private int soTietDay;
	private double donGiaTietDay = 50000;

	public GVThinhGiang() {
		super();

	}

	public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien, int soTietDay) {
		super(hoTen, diaChi, loaiGiangVien);
		this.soTietDay = soTietDay;

	}

	
	public int getSoTietDay() {
		return soTietDay;
	}

	public void setSoTietDay(int soTietDay) {
		this.soTietDay = soTietDay;
	}

	public double getDonGiaTietDay() {
		return donGiaTietDay;
	}

	public void setDonGiaTietDay(double donGiaTietDay) {
		this.donGiaTietDay = donGiaTietDay;
	}

	@Override
	public double tinhLuong() {
		double thuNhap = soTietDay * donGiaTietDay;
		double phanTramThuNhap = 0.15 * thuNhap;
		return thuNhap - phanTramThuNhap;

	}

	public void nhapThongTinGVThinhGiang() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số tiết dạy: ");
		soTietDay = scanner.nextInt();
	}
}
