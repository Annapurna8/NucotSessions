package Interface;

public class Mall implements Nike {

	public static void main(String[] args) {
		Mall ob=new Mall();
		ob.bags();
		ob.shoe();
		ob.services();
		ob.service();
	}

	@Override
	public void shoe() {
		System.out.println("Barnd new shoes");
		
	}

	@Override
	public void bags() {
	System.out.println("Brand New Bags");
		
	}

	@Override
	public void services() {
		System.out.println(" Designing, marketing and distributing of athletic footwear, apparel");
		
	}

	@Override
	public void service() {
	System.out.println(" Metal fabrication services");
		
	}

}
