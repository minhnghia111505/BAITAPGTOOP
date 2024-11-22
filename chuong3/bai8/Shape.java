package bai8;

public abstract class Shape {
	// thuộc tính đại diện cho màu sắc củ hình
	protected String color;

	public Shape(String color) {
		this.color = color;
	}

	// phương thức trừu tượng để tính diện tích( sẽ dc triển khai ở lớp con)
	public abstract double getArea();

	@Override
	//phương thức trừ tượng trả về chuôix mô ta của hình...
	public abstract String toString();
}
