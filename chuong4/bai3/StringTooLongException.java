package bai3;

public class StringTooLongException extends Exception {
	// Constructor nhận thông báo lỗi
    public StringTooLongException(String message) {
        super(message);  // Gọi constructor của lớp Exception
    }
}
