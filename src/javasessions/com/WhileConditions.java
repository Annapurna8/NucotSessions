package javasessions.com;

public class WhileConditions {

	public static void main(String[] args) {
	
		int	i=1;
		while (i<=10)
		{
			System.out.println(i);
			i=i+1;
		}
		
		
	System.out.println("Even");
		int	j=2;
		while (j<=10)
		{
			System.out.println(j);
			j=j+2;
		}
		
		System.out.println("ODD");
		int	k=1;
		while (k<=10)
		{
			System.out.println(k);
			k=k+2;
		}
		
	/*IMPORTANT/*
	 	System.out.println("Infinite Loop");
	 /*
		
		while (true)
		{
			System.out.println("Welcome to Eclipse");
			
		}
		*/
		System.out.println("For loop Natural numbers");
		for (int ii=1; ii<=20 ; ii++)
		{
			System.out.println(ii);
			
		}
		
		System.out.println("For loop odd");
		for (int ii=1; ii<=20 ; ii++)
		{
			System.out.println(ii);
			ii=ii+1;
		}
		/* infinite for loop
		
		for(;;)
		{
			System.out.println("Infinite for loop");
		}*/
		
	}

}
