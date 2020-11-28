package main.java;

public class PizzaPoivronStyleStrasbourg extends Pizza {

	public PizzaPoivronStyleStrasbourg() {
		
	}
	
	protected void preparer() {
		System.out.println("Preparation of Pizza with Strasbourg style sauce and Poivron\r\n" + 
							"Spread the pizza dough...\r\n" + 
							"Add the sauce...\r\n" + 
							"Add the garnitures:\r\n" + 
							"poivron cube chicken Morarella");
	}
	
	@Override
	protected void cut() {
		System.out.println("Cut in square portions");
	}
}