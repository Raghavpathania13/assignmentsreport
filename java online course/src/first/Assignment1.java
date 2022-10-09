package first;

public class Assignment1 
{ 
	int roll_no,age;
	
	void display1()
	{
		System.out.println("Welcome to all of you");
	}
	void display2()
	{
		System.out.println("Automation si very easy");
	}
	public static void main(String[] args) {
		Assignment1 s=new Assignment1();
		s.display1();
		s.display2();
		s.roll_no=10;
		s.age=15;
		System.out.println(s.roll_no);
		System.out.println(s.age);
	}
	

}
