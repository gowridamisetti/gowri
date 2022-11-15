package student;

public class constructor {
	public void m1() {
		System.out.println("method1");
	}
	public void m2() {
		this.m1();
		System.out.println("method2");
		this.m3();
		this.m4();
	}
	public void m3() {
		System.out.println("method3");
	}
	public void m4() {
		System.out.println("method4");
	}
	public constructor() {
		//this(2);
		System.out.println("default constructor");
		
	}
	public constructor(int a){
		this(2,3);
		System.out.println("one parameter constructor");
	}
	public constructor(int a,int b) {
		this();
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) {
		constructor obj=new constructor(1);
		obj.m2();
	}

}
