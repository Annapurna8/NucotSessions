package javasessions.com;

public class NonImplemented {

	void Add()
	{
		System.out.println("no return type and no arguments");
		int a=2, b=3;
		int d=a+b;
		System.out.println(d);
		
	}
	
	int Sub()
	{
		System.out.println("having return type and no arguments");
		int aa=20, bb=10;
		int cc=aa-bb;
	    return cc;	
		
	}
		
	void mul(int x, int y)
	
	{
		System.out.println("no return type and with arguments");
		 int z=x*y;
		 System.out.println(z);
	}
	
	int Division(int p, int q)
	{

		System.out.println("with return type and with arguments");
		int r=p/q;
		return r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NonImplemented obj=new NonImplemented();
		obj.Add();
		
		int sum=obj.Sub();
		System.out.println(sum);
		
		obj.mul(2, 10);
		
		int div=obj.Division(4, 2);
		System.out.println(div);
		
		

	}

}
