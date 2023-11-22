package javasessions.com;

public class ConditionalState {

	public static void main(String[] args) {
		System.out.println("Conditional Statemets Add|Sub|Mul :-");
		int a=1, b=2;
		int c=a+b;
		System.out.println(c);
		if(c==3)
		{
			System.out.println("Addition");
		}
			else if(c==-1)
			{
				System.out.println("substraction");
				
			}
			else if(c==2)
			{
				System.out.println("Multiplication");
			}
			else
			{
				System.out.println("Default Values");
			}
		

	}

}
