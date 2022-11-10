package student;



public class method_types {
	public int sum(int a,int b)
	{
		int c=a+b;
		
		System.out.println("addition of two numbers:"+c);
		return c;
		
	}
	public int sub(int a,int b)
	{
		int d=a-b;
		System.out.println("subtract two numbers:"+d);
	return d;
	}
	
	public static void main(String[] args) {
		method_types obj=new method_types();
		obj.sum(2,4);
		obj.sub(5, 3);
		
		int result=obj.sum(3, 4);
		int d=obj.sub(9,5);
		
		System.out.println("multiply:"+result *d);
		
	}

}
