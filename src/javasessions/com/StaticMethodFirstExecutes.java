package javasessions.com;

public class StaticMethodFirstExecutes {
	
	static void abc()
{
		int a=10,b=20;
		int c =a+b;
		
	System.out.println("Static method executes first & \n c-->"+c);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abc();
		
System.out.println("then moves to main method.");
	}

}
