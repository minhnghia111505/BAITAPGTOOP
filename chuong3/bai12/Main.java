package bai12;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng SVCĐN
        SVCĐN svCĐN = new SVCĐN("Nguyễn Văn A", "01/01/2000", "Hà Nội", "SVCĐN");
        svCĐN.nhapThongTin();
        svCĐN.nhapThongTinThem();

        // Tạo đối tượng SVCĐCQ
        SVCĐCQ svCĐCQ = new SVCĐCQ("Trần Thị B", "15/05/1999", "TP Hồ Chí Minh", "SVCĐCQ");
        svCĐCQ.nhapThongTin();
        svCĐCQ.nhapThongTinThem();

        // In thông tin các đối tượng
        System.out.println("\nThông tin sinh viên Cao đẳng nghề:");
        svCĐN.inThongTin();

        System.out.println("\nThông tin sinh viên Cao đẳng chính quy:");
        svCĐCQ.inThongTin();
    }
}

