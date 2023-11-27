package javasessions.com;

import java.util.Arrays;

public class Forloop {

	public static void main(String[] args) {
		int a[]=new int[5];
		
		a[0]=1;
		a[1]=11;
		a[2]=111;
		a[3]=1111;
		a[4]=11111;
		System.out.println("Array values");
		System.out.println(a[0]);
		System.out.println(a[3]);
//	System.out.println(a[5]);   //throws exception:Array index out of bounds exception
	
		System.out.println("-------forloop using------------");	
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		
		System.out.println("Withoutt using forloop");
		
		System.out.println(a);// prints or returns address
		System.out.println(Arrays.toString(a));
		
		
		
		System.out.println("***String Data type***");
		String s[]=new String[5];
		s[0]="ChromeBrowser";
		s[1]="OperaBrowser";
		s[2]="Firefox";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]); 
		System.out.println(s.length);
		System.out.println(s[4]);// throws null(string so)
		
		System.out.println("--------forloop using-----------");	
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
			
		}
		
	
		
		System.out.println("***Float Data type***");
		Float f[]=new Float[5];
		f[0]=(float)1.0;
		f[1]=(float)2.0;
		f[2]=(float)3.0;
		
		System.out.println(f[0]);
		System.out.println(f[1]);
		System.out.println(f[2]);
		
		System.out.println("-------forloop using------------");	
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
			
		}
		
		System.out.println(f);// prints or returns address
		System.out.println(Arrays.toString(f));
		
		
		
		System.out.println("***char Data type***");
		char c[]=new char[5];
		c[0]='c';
		c[1]='h';
		c[2]='a';
		
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
		System.out.println(c[4]);
		
		System.out.println("------forloopusing-------------");	
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
			
		}
		System.out.println("=====without forloop=====");
		System.out.println(c);// prints or returns address
		System.out.println(Arrays.toString(c));

		
		System.out.println("***Double Data type***");
		double d[]=new double[5];
		d[0]=10.001;		
		d[1]=20.002;
		d[2]=30.003;
		d[4]=50.005;
		
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
		//System.out.println(d[5]);// throws exception
		
		System.out.println("------forloopusing-------------");	
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
			
		}
		System.out.println("=====without forloop=====");
		System.out.println(c);// prints or returns address
		System.out.println(Arrays.toString(d));

		
	}

}
