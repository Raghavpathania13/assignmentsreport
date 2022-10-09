package third;

public class Constructor 
{
	public Constructor() 
	  {
		 this (22 , 21 , 11); //third
		System.out.println("default constructor.");  
	  }
	  public Constructor(int a) //first
	  {
		  this (20 , 26);
		  System.out.println("one parameterized constructor.");  
	  }
	  public Constructor(int a , int b) //second
	  {
		  this ();           
		  System.out.println("two parameterized constructor.");  
	  }
	  public Constructor(int a , int b , int c) //fourth
	  {
		System.out.println("three parameterized constructor."); 
	  }
	  public static void main(String[] args) 
	  {
		  Constructor s=new Constructor(29);
	  }
}
