package main.java;
public class PizzeriaBrest extends Pizzeria{
	public PizzeriaBrest() {
        this.PizzaFactory = PizzaFactoryBrest.getInstance();
    }

   
}