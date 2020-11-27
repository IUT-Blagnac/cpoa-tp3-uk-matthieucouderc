public abstract class Pizzeria {
	protected Pizza createPizza (String name) {
		Pizza pizza;
		  if (name.equals("Pizza with Brest style sauce and cheese")) {
			  pizza = new PizzaCheeseStyleBrest();
			  } else if (name.equals("Pizza with Strasbourg style sauce and cheese")) {
			  pizza = new PizzaCheeseStyleStrasbourg();
			  } else {
			  pizza = new PizzaCheeseStyleStrasbourg();
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


