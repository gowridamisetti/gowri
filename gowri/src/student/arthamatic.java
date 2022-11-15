package student;

public class arthamatic
{
	
	public int sum(int a,int b) {
		int c;
		c=a+b;
			System.out.println("sum of two numbers:"+c);
			return c;
	}
	public int sub(int a,int b) {
		int c;
		c=a-b;
		System.out.println("subtract two numbers:"+c);
		return c;		
	}
	public void mul(int a,int b){
		int c;
		c=a*b;
		System.out.println("multiply two numbers"+c);
	}
	public static void main(String[] args) {
		arthamatic obj=new arthamatic();
		int result=obj.sum(10, 3);
		int result1=obj.sub(11, 4);
		obj.mul(result, result1);
		
	}

}
