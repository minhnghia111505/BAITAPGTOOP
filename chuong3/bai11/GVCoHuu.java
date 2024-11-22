package bai11;

import java.util.Scanner;

public class GVCoHuu extends GiangVien {
	private double luongCoBan = 100000;
	private double heSoLuong = 2.5;
	private int thamNien;

	public GVCoHuu() {
		super();

	}

	public GVCoHuu(String hoTen, String diaChi, String loaiGiangVien, int thamNien) {
		super(hoTen, diaChi, loaiGiangVien);
		this.thamNien = thamNien;
	}

	@Override
	public double tinhLuong() {
		double phuCap = 0;
		if (thamNien >= 5) {
			phuCap = 0.05 * luongCoBan + (thamNien - 5) * 0.01 * luongCoBan;

		}
		return luongCoBan * heSoLuong + phuCap;
	}

	public void nhapThongTinGVCoHuu() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số năm công tác: ");
		thamNien = scanner.nextInt();
	}
}
