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
			    
		  return pizza;
		  }
	public Pizzeria (PizzaFactory pizzaFactory) {
	
	}
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);
		
		pizza.prepare();
		  pizza.bake();
		  pizza.cut();
		  pizza.wrap();
		  
		  return pizza;
	
	}
	
}


