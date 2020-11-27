import java.util.ArrayList;

public class PizzaPoivronStyleStrasbourg extends Pizza{
	public PizzaPoivronStyleStrasbourg() {
		this.garnitures = new ArrayList<String>();
        this.garnitures.add("Poivrons");
        System.out.println("Preparation of Pizza with Brest style sauce and cheese");
	}

}
