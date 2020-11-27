import java.util.ArrayList;

public class PizzaCheeseStyleStrasbourg extends Pizza{
	public PizzaCheeseStyleStrasbourg() {
		this.garnitures = new ArrayList<String>();
        this.garnitures.add("Mozarella");
        System.out.println("Preparation of Pizza Strasbourg style sauce and cheese");
	}
	
	public void cut() {
		System.out.println("Cut in square portions");
}
}
