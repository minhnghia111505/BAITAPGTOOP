package bai7;

class Circle implements GeometricObject {

	protected double radius = 1;

	public Circle(double Radius) {
		this.radius = Radius;
	}

	@Override
	public double Perimeter() {

		return 2 * Math.PI * radius;
	}

	public double Area() {

		return Math.PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
