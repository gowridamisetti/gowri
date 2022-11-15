package student;

public class method_types {
	int c;

	public void sum(int a, int b) {
		c = a + b;
		this.sub(a, b);
	}

	public void sub(int a, int b) {
		int d = a - b;
		d = c * d;
		System.out.println(d);
	}

	public void mul(int a, int b) {
		int d = a * b;
		System.out.println("multiply two values:" + d);
	}

	public static void main(String[] args) {

		method_types obj = new method_types();
		obj.sum(2, 4);

	}

}
