import pizza.Pizza;
import pizza.PizzaFactory;

public class PizzaFactoryBrest extends PizzaFactory {
	
	public Pizza create(String name) {
		Pizza pizza;
		
		if (name == "Cheese") {
			pizza = new PizzaCheeseStyleBrest();
		}else if (name == "Grecque") {
			pizza = new PizzaGrecqueStyleBrest();
		}else {
			pizza = new PizzaPoivronStyleBrest();
		}
			
		return pizza;
	}
}
