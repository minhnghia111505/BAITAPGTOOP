package bai2;

//Lớp này kế thừa từ Exception ở thư viện java
public class InvalidDateException extends Exception {
 // Constructor nhận thông báo lỗi
 public InvalidDateException(String message) {
     super(message); // Gọi constructor của lớp Exception
 }
}
