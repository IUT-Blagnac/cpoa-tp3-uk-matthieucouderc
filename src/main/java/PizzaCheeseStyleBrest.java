
package main.java;

public class PizzaCheeseStyleBrest extends Pizza {
	
	public PizzaCheeseStyleBrest() {
        this.name = ("Pizza with Brest style sauce and cheese");
        this.garnitures.add("Parmigiano reggiano");
	}
	@Override
	protected void cut() {
		System.out.println("Cut the pizza in triangles ");
	}

}
