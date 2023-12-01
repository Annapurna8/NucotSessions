package javasessions.com;

public class Nonstatic {
	void add() // no return & no args

	{
		System.out.println("Non implemented methods:");
	}
	
	float div(float c) //with return & args
	{
		
		return c;
	}
	
	void mul(double a, double b) // no return type & with args
	{
		double c=a*b;
		System.out.println(c);
	}
	int add1() // return type & with no args
	{
		int x=10;
		int y=15;
		int z=x+y;
		
		return z;
	}
	public static void main(String[] args) {
		Nonstatic obj=new Nonstatic();
		obj.add();
		obj.mul(12.15, 20.05);
	
		obj.div(33);
		obj.add1();
		
		
	}

}
