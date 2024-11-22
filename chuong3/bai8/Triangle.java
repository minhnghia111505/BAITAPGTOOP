package bai8;

public class Triangle extends Shape {
	//base và height: Thuộc tính biểu diễn cạnh đáy và chiều cao của tam giác.
	private int base; 
    private int height;

    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    // tính diện tích tam giác
    @Override
    public double getArea() {
        return 0.5 * base * height; 
    }

    @Override
    public String toString() {
        return "Triangle [color=" + color + ", base=" + base + ", height=" + height + ", area=" + getArea() + "]";
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
