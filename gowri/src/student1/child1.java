package student1;
import student.child;

public class child1 extends child{
	
	public void mul(int a,int b) {
		int c=a*b;
		System.out.println("multiply two numbers:"+c);
	}
	public static void main(String[] args) {
		child1 obj=new child1();
		obj.mul(2, 4);
		obj.sub(9, 4);
		obj.sum(9, 4);
	}

}
