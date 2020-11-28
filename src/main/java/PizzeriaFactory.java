package main.java;

public class PizzeriaFactory {
	
	static PizzeriaFactory instance = new PizzeriaFactory();
	
	
	private PizzeriaFactory() {
	}
	
	public static PizzeriaFactory getInstance() {
		return instance;
	}
	
	public Pizzeria create(String type) {
        Pizzeria pizzeria = null;
        if (type.equals("Brest")) {
                pizzeria = new PizzeriaBrest();
        }else if (type.equals("Strasbourg")) {
                pizzeria = new PizzeriaStrasbourg();
        }
        return pizzeria;
    }
	
}
