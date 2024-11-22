package bai2;

public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    // Phương thức tạo đầy đủ
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        if (ngay < 1 || ngay > 31) {
            throw new InvalidDateException("Ngày không hợp lệ! Ngày phải nằm trong khoảng 1-31.");
        }
        if (thang < 1 || thang > 12) {
            throw new InvalidDateException("Tháng không hợp lệ! Tháng phải nằm trong khoảng 1-12.");
        }
        if (nam < 1) {
            throw new InvalidDateException("Năm không hợp lệ! Năm phải là số dương.");
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Phương thức hiển thị thời gian
    public void hienThi() {
        System.out.println("Thời gian: " + ngay + "/" + thang + "/" + nam);
    }
}
