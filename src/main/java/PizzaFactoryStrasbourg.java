public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	private static PizzaFactoryStrasbourg uniqueInstance ;
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza;
		
		if (name == "Cheese") {
			pizza = new PizzaCheeseStyleStrasbourg();
		}else if (name == "Grecque") {
			pizza = new PizzaGrecqueStyleStrasbourg();
		}else {
			pizza = new PizzaPoivronStyleStrasbourg();
		}
			
		return pizza;
	}

}
