package student;

public class parentcon {
	public parentcon() {
		this(1,2,3);
		System.out.println("parent default constructor");

	}

	public parentcon(int a) {
this();
		System.out.println("parent one parameterized con");
	}

	public parentcon(int a, int b) {
		this(1);
		System.out.println("parent two parameterized con");
	}

	public parentcon(int a, int b, int c) {

		System.out.println("parent three parameterized con");
	}

	public static void main(String[] args) {
		parentcon con = new parentcon(1,2);

	}

}
