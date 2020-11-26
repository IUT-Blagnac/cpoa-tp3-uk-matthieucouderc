import pizza.Pizza;
import pizza.PizzaFactory;

public abstract class Pizzeria {
	protected Pizza createPizza (String type) {
		Pizza pizza ;
		 if (type.equals("fromage")) {
			  pizza = new PizzaCheeseStyleBrest();
			  } else if (type.equals("poivron")) {
			  pizza = new PizzaGrecqueStyleStrasbourg();
			  } else {
			  pizza = new PizzaPoivronStyleBrest();
			  }
			  
		  
		  pizza.prepare();
		  pizza.bake();
		  pizza.cut();
		  pizza.wrap();
		  
		  return pizza;
		  }
	public Pizzeria (PizzaFactory pizzaFactory) {
		
	}
}


