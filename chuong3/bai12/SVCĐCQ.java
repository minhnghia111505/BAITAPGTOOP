package bai12;
import java.util.Scanner;
public class SVCĐCQ extends Nguoi {
    private double tongDiemKiemTra;
    private int soMonKiemTra;
    private double diemThiKetThucHP;

    public SVCĐCQ(String hoTen, String ngaySinh, String diaChi, String loaiSinhVien) {
        super(hoTen, ngaySinh, diaChi, loaiSinhVien);
    }

    public void nhapThongTinThem() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng điểm các môn kiểm tra: ");
        tongDiemKiemTra = scanner.nextDouble();
        System.out.print("Nhập số môn kiểm tra: ");
        soMonKiemTra = scanner.nextInt();
        System.out.print("Nhập điểm thi kết thúc học phần: ");
        diemThiKetThucHP = scanner.nextDouble();
    }

    @Override
    public double tinhDiem() {
        return (tongDiemKiemTra / soMonKiemTra + diemThiKetThucHP) / 3;
    }
}
