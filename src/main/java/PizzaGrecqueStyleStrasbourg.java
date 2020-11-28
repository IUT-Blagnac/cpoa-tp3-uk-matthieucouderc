package main.java;
public class PizzaGrecqueStyleStrasbourg extends Pizza {

	public PizzaGrecqueStyleStrasbourg() {
		this.name = "Pizza sauce style Strasbourg and Grecque";
		this.garnitures.add(" Mozzarella");
		
	}
	
	@Override
	protected void cut() {
		System.out.println("Cut in square portions");
	}
}