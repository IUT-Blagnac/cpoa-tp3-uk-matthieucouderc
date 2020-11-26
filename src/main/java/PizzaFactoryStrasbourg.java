import pizza.Pizza;
import pizza.PizzaFactory;

public class PizzaFactoryStrasbourg extends PizzaFactory{
	
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
