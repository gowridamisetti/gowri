package student;

public class constructor {
	public constructor() {
		this(11, 22, 44, 33);
		System.out.println("enter default constructor");
	}

	public constructor(int a) {
		this();
		System.out.println("enter single parameterrized constructor");
	}

	public constructor(int a, int b) {
		this(11,22,33);
		System.out.println("enter doubla parameterized constuctor");
	}

	public constructor(int a, int b, int c) {
		this(11);
		System.out.println("enter 3 parameterized constuctor");
	}

	public constructor(int a, int b, int c, int d) {
		System.out.println("enter 4 parameterized constuctor");
	}


	public static void main(String[] args) {
		constructor con1 = new constructor(22,33);

	}
}
