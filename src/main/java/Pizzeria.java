package main.java;
public abstract class Pizzeria {
	
	PizzaFactory PizzaFactory;
	
	
	public Pizza orderPizza(String string) {
		Pizza instance = PizzaFactory.create(string);
		
		instance.prepare();
		instance.bake();
		instance.cut();
		instance.wrap();
		  
		  return instance;
	}
	
}


