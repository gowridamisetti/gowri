package student;

public class var_mod {
	int rollno;
	int age;
	public void display() {
	System.out.println("display");
	}
	public static void main(String[] args) {
		var_mod obj=new var_mod();
		obj.display();
		obj.rollno=3;
		obj.age=25;
		System.out.println("enter the rollno:"+obj.rollno);
		System.out.println("enter the age:"+obj.age);
	}

}
