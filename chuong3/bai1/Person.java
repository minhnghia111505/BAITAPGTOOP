package bai1;

public class Person {

	private String name;
	private String dob; // ngay sinh
	private String pob; // noi sinh
	private char gender; // gioi tinh : nam la 'M', nu la 'N'
	private String email;
	private String phone;

	// constructor
	public Person() {
		this.name = "";
		this.dob = "";
		this.pob = "";
		this.gender = ' ';
		this.email = "";
		this.phone = "";
	}

	public Person(String name, String dob, String pob, char gender, String email, String phone) {
		this.name = name;
		this.dob = dob;
		this.pob = pob;
		this.gender = gender;
		this.email = email;
		this.phone = phone;
	}

	// setter and getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getPob() {
		return pob;
	}

	public void setPob(String pob) {
		this.pob = pob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	// toString
	@Override
	public String toString() {
		return "Person [name : " + name + ", dob : " + dob + ", pob : " + pob + ", gender : " + gender + ", email : "
				+ email + ", phone : " + phone + "]";
	}

}