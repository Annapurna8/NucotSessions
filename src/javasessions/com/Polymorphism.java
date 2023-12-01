package javasessions.com;

public class Polymorphism {
	
	void buy(String product)
	{
		System.out.println(product);
		
	}
	void buy(String dress, int price)
	{
		System.out.println("Dress & its price is:\n"+dress+"\t" +price);
	}
void buy(int price, String kitchen)
{
	System.out.println("Price & Kitchenappliance:\n" +price+"\t"+kitchen);
	
}
public static void main(String[] args)
{
	System.out.println("********POLYMORPHISM*********");
		Polymorphism ob=new Polymorphism();
		ob.buy("jumpsuit");
		ob.buy(50, "Spoons");
		ob.buy("jeans", 500);
		
	}

}
