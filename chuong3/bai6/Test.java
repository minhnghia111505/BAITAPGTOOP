package bai6;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("nam", 12, '1');
		Person e1 = new Employee();
		Person e2 = new Employee("nam", 33, '1', "minh", "5 ngay");
		
		PartTimeEmployee p3=new PartTimeEmployee();
		PartTimeEmployee p4 = new PartTimeEmployee("Nam",21,'1',"Bac","1 day",21);
		System.out.println("hien thong tin " + p1);
		System.out.println("hien thong tin " + p2);
		System.out.println("hien thong tin " + e1);
		System.out.println("hien thong tin " + e2);
		System.out.println("hien thong tin " + p3);
		System.out.println("hien thong tin " + p4);
	}
}
