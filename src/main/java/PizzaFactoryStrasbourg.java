public class PizzaFactoryStrasbourg extends PizzaFactory{
	
	private static PizzaFactoryStrasbourg uniqueInstance ;
	
	private PizzaFactoryStrasbourg() {
		
	}
	
	public static PizzaFactoryStrasbourg getInstance() {
		return uniqueInstance;
	}
	
	public Pizza create(String name) {
		Pizza pizza;
		
		if (name == "Pizza Strasbourg style sauce and cheese") {
			pizza = new PizzaCheeseStyleStrasbourg();
		}else if (name == "Pizza with Brest style sauce and cheese") {
			pizza = new PizzaGrecqueStyleStrasbourg();
		}else {
			pizza = new PizzaPoivronStyleStrasbourg();
		}
			
		return pizza;
	}

}
