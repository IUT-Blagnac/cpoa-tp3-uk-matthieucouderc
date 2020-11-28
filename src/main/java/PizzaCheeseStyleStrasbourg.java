
package main.java;

public class PizzaCheeseStyleStrasbourg extends Pizza{
	public PizzaCheeseStyleStrasbourg() {
        this.garnitures.add("Mozarella");
        this.name = ("Pizza Strasbourg style sauce and cheese");
	}
	
	public void cut() {
		System.out.println("Cut in square portions");
}
}