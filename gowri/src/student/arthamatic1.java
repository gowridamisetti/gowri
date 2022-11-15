package student;

public class arthamatic1 {
	public int sum(int a,int b) {
		int c;
		c=a+b;
		System.out.println("addition of two numbers:"+c);
		return c;
	}
	public int sub(int a,int b) {
		int c;
		c=a-b;
		System.out.println("subtract of two numbers:"+c);
		return c;
	}
	public int mul(int a,int b) {
		int c;
		c=a*b;
		System.out.println("multiplication of two numbers:"+c);
		return c;
	}
	public int div(int a,int b) {
		int c;
		c=a/b;
		System.out.println("divition of two numbers:"+c);
		return c;
	}
	public static void main(String[] args) {
		arthamatic1 obj=new arthamatic1();
		int result=obj.sum(12, 3);
		int result1=obj.sub(result, 4);
		int result2=obj.mul(result1,result);
		int result3=obj.div(result2, 4);
	}
	

}
