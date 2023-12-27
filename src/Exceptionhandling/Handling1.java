package Exceptionhandling;

public class Handling1 {

	public static void main(String[] args) {
		
		System.out.println("Exceptions");
		
		try
		{
			int a=100/0;
			System.out.println(100);
			System.out.println(200);
			
		}
		catch(ArithmeticException AE)
		{
			System.out.println("AE");
		AE.printStackTrace();
		}

		System.out.println("====Thanks====");
	}

}
