package Exceptionhandling;

public class DivExceptioHandling {

	public static void main(String[] args) {
	
		int div1=div(5,0);
		System.out.println(div1);
		
	}
	
	public static int div(int a, int b)
	{
		int result=-1;
		try
		{
			 result= a/b; // bcoz b is 0 it throws exception, & so we are using try catch block here
	
		}
		catch(ArithmeticException AE)
		{
			System.out.println("Ae is coming");
			//AE.printStackTrace();
		}
			
		return result;
	}

}
