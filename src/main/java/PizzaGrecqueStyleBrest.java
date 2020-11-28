package main.java;
public class PizzaGrecqueStyleBrest extends Pizza{
	public PizzaGrecqueStyleBrest() {
		
	}
	
	protected void preparer() {
		System.out.println("Preparation of Pizza Grecque with Brest style sauce\r\n" + 
							"Spread the pizza dough...\r\n" + 
							"Add the sauce...\r\n" + 
							"Add the garnitures:\r\n" + 
							"cherry tomate olive noir feta");
	}

	protected void cut() {
		System.out.println("Cut the pizza in triangles");
	}
}
