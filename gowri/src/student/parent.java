package student;

public class parent {
	public void sum(int a,int b) {
	int c=a+b;
	System.out.println("sum of two numbers:"+c);
	}
	public static void main(String[] args) {
		parent obj=new parent();
		obj.sum(3, 5);
		
				
	}
}
