package bai7;

class ResizableCircle extends Circle implements Resizable {

	public ResizableCircle(double radius) {
		super(radius);
	}

	@Override
	public int resize(int percent) {

		this.radius = radius * (1 + percent / 100.0);
		return percent;

	}

}