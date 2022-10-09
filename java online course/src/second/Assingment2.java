package second;

public class Assingment2 
{
	public int sum(int a , int b)
	{
		int c=a+b;
		System.out.println("first step:"+c);
		return c;
	}
	public int sub(int a1 , int b1)
	{

		int c2=a1-b1;
		System.out.println("second step:"+c2);	
		return c2;
	}
	public int mul(int a2 , int b2)
	{
		int c3=a2*b2;
		System.out.println("third step:"+c3);
		return c3;
	}
	public void div(int a3 , int b3)
	{
		int c4=a3/b3;
		System.out.println("final result is:"+c4);
		
	}
	public static void main(String[] args) 
	{
		Assingment2 s=new Assingment2();
		int sumresult=s.sum(10 , 2);
		int subresult=s.sub(sumresult , 2);
		int mulresult=s.mul(subresult , 2);
		s.div(mulresult , 2);
		
     }
}

