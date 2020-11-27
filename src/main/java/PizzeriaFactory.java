//import pizza.Pizza;

public class PizzeriaFactory {
	
	private static PizzeriaFactory uniqueInstance = new PizzeriaFactory();
	
	
	PizzeriaFactory() {
	}
	
	public static PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	public Pizzeria create(String name) {
        Pizzeria pizzeria = null;
        switch (name) {
            case "Brest":
                pizzeria = new PizzeriaBrest(PizzaFactoryBrest.getInstance());
                break;
            case "Strasbourg":
                pizzeria = new PizzeriaStrasbourg(PizzaFactoryStrasbourg.getInstance());
                break;
            default:
                System.out.println("no pizzeria style specified");
                break;
        }
        return pizzeria;
    }
	
}
