package bai6;

public class PartTimeEmployee extends Employee {
	private int hoursPerWeek;

	public PartTimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PartTimeEmployee(String name, int age, char gender, String employerName, String dateHired, int hoursPerWeek) {
		super(name, age, gender, employerName, dateHired);
		this.hoursPerWeek=hoursPerWeek;
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee [hoursPerWeek=" + hoursPerWeek + ", toString()=" + super.toString() + "]";
	}
}
