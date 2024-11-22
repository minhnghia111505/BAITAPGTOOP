package bai5;

public class OutOfRangeException extends Exception {
    public OutOfRangeException(String message) {
        super(message); // Gọi constructor của lớp Exception với thông báo lỗi
    }
}
