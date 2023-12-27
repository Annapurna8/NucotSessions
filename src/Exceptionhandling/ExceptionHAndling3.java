package Exceptionhandling;

public class ExceptionHAndling3 {
	int a;
	public static void main(String[] args) {
		
		ExceptionHAndling3 obj=new ExceptionHAndling3();
		 obj=null;
		 System.out.println("Handlig null poiter exception");
		 try
		 {
			 obj.a=20;

		 }
		 catch(Exception e)
		 {
			 System.out.println("1. Null pointer exception");
			// e.printStackTrace();
		 }
		 try
		 {
		 int i=0/0;
		 }
		 catch(Exception e)
		 {
			 System.out.println("2.Arithmetic exception");
		 }
	}

}
