package Object;

public class Student {
	int roll_no;
	String name;
	int id;
	String address;
	public static void main(String[] args) {
		Student stud=new Student();
		stud.roll_no=01;
		stud.name="Rahul";
		stud.id=07;
		stud.address="Nasik";
		
		System.out.println("   "+stud.roll_no+"   "+stud.name+"   "+stud.id+"   "+stud.address);
		
		Student stud1=new Student();
		stud1.roll_no=02;
		stud1.name="Anjali";
		stud1.id=03;
		stud1.address="Gonde";
		
		System.out.println(stud1.roll_no);
		System.out.println(stud1.name);
		System.out.println(stud1.id);
		System.out.println(stud1.address);
	}

}
