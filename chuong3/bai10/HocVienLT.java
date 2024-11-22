package bai10;

import java.util.Scanner;

public class HocVienLT extends HocVien {
	private int soBuoi;
	private double donGia = 300000; // Đơn giá cho chương trình Lập trình

	public HocVienLT(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi) {
		super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
		this.soBuoi = soBuoi;
	}

	@Override
	public double hocPhi() {
		double uuTienGiam = (loaiUuTien == 1) ? 1000000 : 800000;
		return soBuoi * donGia - uuTienGiam;
	}

	public void nhapThongTinHocVienLT() {
		super.nhapThongTin();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số buổi học: ");
		soBuoi = scanner.nextInt();
	}
}
