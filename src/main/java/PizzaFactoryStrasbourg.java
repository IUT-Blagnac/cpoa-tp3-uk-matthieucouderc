package main.java;
public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	static PizzaFactoryStrasbourg instance = new PizzaFactoryStrasbourg();
	
	
	private PizzaFactoryStrasbourg() {	
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return instance;
	}
	
	public Pizza create(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new PizzaCheeseStyleStrasbourg();
		}else if (type.equals("poivron")) {
			pizza = new PizzaPoivronStyleStrasbourg();
		}else {
			pizza = new PizzaGrecqueStyleStrasbourg();
		}
			
		return pizza;
	}
}