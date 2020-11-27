import java.util.ArrayList;

public class PizzaCheeseStyleBrest extends Pizza {
	
	public PizzaCheeseStyleBrest() {
		this.garnitures = new ArrayList<String>();
        this.garnitures.add("Parmigiano reggiano");
        System.out.println("Preparation of Pizza with Brest style sauce and cheese");
	}

}
