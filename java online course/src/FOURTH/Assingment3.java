package FOURTH;

public class Assingment3 
{
	public Assingment3() //by using constructor with this keyword
	  {
		 this (22 , 21 , 11); //third
		System.out.println("default constructor.");  
	  }
	  public Assingment3(int a) //first
	  {
		  this (20 , 26);
		  System.out.println("one parameterized constructor.");  
	  }
	  public Assingment3(int a , int b) //second
	  {
		  this ();           
		  System.out.println("two parameterized constructor.");  
	  }
	  public Assingment3(int a , int b , int c) //fourth
	  {
		System.out.println("three parameterized constructor."); 
	  }
	  public static void main(String[] args) 
	  {
		  Assingment3 s=new Assingment3(29);
	  }
}
