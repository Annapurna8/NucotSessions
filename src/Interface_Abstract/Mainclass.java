package Interface_Abstract;

public class Mainclass implements Flipkart{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mainclass ob=new Mainclass();
ob.buying_details();
ob.cart();
ob.home();ob.item(); ob.product();
	}

	@Override
	public void item() {
		System.out.println("\tProduct:\n\n1) Denims");
		System.out.println("2) Zara");
		System.out.println("3) Pepe jeans");
	}

	@Override
	public void buying_details() {
		System.out.println("\tDetails:\n\nCotton");
		System.out.println("Lycra");
		System.out.println("size");
		System.out.println("Colour");
			
		
	}

	@Override
	public void cart() {
		System.out.println("\tCart:\n\n Belt");
		System.out.println("Ran bay Goggle");
		
		
	}

	@Override
	public String home() {
		// TODO Auto-generated method stub
		return "Home";
	}

	@Override
	public String kitchen() {
		// TODO Auto-generated method stub
		return "Kitchen";
	}

	@Override
	public String product() {
		// TODO Auto-generated method stub
		return "Dress";
	}

}
