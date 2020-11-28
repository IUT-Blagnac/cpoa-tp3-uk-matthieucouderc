package main.java;
public class PizzaPoivronStyleBrest extends Pizza{
	public PizzaPoivronStyleBrest() {
			
	}
		
	protected void preparer() {
		System.out.println("Preparation of Pizza with Brest style sauce and Poivron\r\n" + 
							"Spread the pizza dough...\r\n" + 
							"Add the sauce...\r\n" + 
							"Add the garnitures:\r\n" + 
							"poivron chicken Morarella");
	}

	protected void cut() {
		System.out.println("Cut the pizza in triangles");
	}
	
}
