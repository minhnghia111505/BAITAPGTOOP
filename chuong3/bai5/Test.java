package bai5;

public class Test {

	public static void main(String[] args) {
		Nguoi n1=new Nguoi();
		Nguoi n2 =new Nguoi("Nguyen Van Nam",20,'1');

		
		System.out.println("hien thong tin "+ n1);
		System.out.println("hien thong tin "+ n2);
		
		Truong trg1= new Truong();
		Truong trg2= new Truong("HAUI","NHON","HIEU TRUONG");
		System.out.println("hien thong tin truong "+ trg1);
		System.out.println("hien thong tin truong "+ trg2);
		
		SinhVien sv1 = new SinhVien();
		SinhVien sv2 = new SinhVien("Nguyen Van",20,'1',"10a1","ktpm",trg2);
		System.out.println("hien thong tin "+ sv1);
		System.out.println("hien thong tin "+ sv2);
	}
}
