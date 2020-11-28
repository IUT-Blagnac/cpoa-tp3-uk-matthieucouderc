package main.java;
public class PizzaFactoryBrest extends PizzaFactory {
	
	static PizzaFactoryBrest instance = new PizzaFactoryBrest();
	
	
	private PizzaFactoryBrest() {	
	}
	
	public static PizzaFactoryBrest getInstance() {
		return instance;
	}
	
	public Pizza create(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new PizzaCheeseStyleBrest();
		}else if (type.equals("poivron")) {
			pizza = new PizzaPoivronStyleBrest();
		}else {
			pizza = new PizzaGrecqueStyleBrest();
		}
			
		return pizza;
	}
}