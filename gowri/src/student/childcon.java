package student;

public class childcon extends parentcon{
	public childcon() {
		this(1,2);
		System.out.println("child default con");

	}
	public childcon(int a) {
		this();
		System.out.println("child one parameterized con");
	}
	public childcon(int a,int b) {
		super(1,2);
		System.out.println("child two parameterized con");
	}
	public childcon(int a,int b,int c) {
		this(1);
		System.out.println("child three parameterized con");
	}
	public static void main(String[] args) {
		childcon c=new childcon(1,2,3);
	}


}
