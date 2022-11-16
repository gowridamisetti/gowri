package student;

public class child extends parent{
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println("difference of two numbers:"+c);
	}
	public static void main(String[] args) {
		child obj=new child();
		obj.sub(5, 3);
		obj.sum(4, 4);
	}
}
