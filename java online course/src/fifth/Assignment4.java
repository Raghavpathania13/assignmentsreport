package fifth;

public class Assignment4 
{
	public void method()
	{
		method3();
	 System.out.println("default method");
	}
	public void method1() 
	{
		this.method();
	 System.out.println("one parameterized method.");
	}
	public void method2()
	{
		this.method1();
	 System.out.println("two parameterized method.");
	}
	public void method3()
	{
	 System.out.println("three parameterized method.");
	}
	public void method4()
	{ 
	this.method2();
	System.out.println("four parameterized method.");
	}
	public static void main(String[] args) 
	{
	Assignment4 s=new Assignment4();
	s.method4();
	}
}
