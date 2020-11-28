package main.java;


import java.util.ArrayList;

public abstract class Pizza {
	
	
	protected String name;
	protected String crust;
	protected String sauce;
	protected ArrayList<String> garnitures;
	
	protected Pizza() {
		this.name="";
		this.crust="";
		this.sauce="";
		this.garnitures= new ArrayList<String>();
			
	}

	protected void prepare() {
		System.out.println("Preparation of " + this.name);
		System.out.println("Spread the pizza dough...");
		System.out.println("Add the sauce...");
		System.out.println("Add the garnitures: ");
		
        
		for (int i = 0; i < garnitures.size(); i++) {
			System.out.println(" " + this.garnitures.get(i));
		}

	}

	protected void bake() {
		System.out.println("Bake 25 minutes at 180°");
		
	}

	protected void cut() {
		
	}

	protected void wrap() {
		System.out.println("Put the pizza in the official box");
		
	}
	public String getName() {
		return name;
		
	}
	
	public void setName(String pName) {
		this.name = pName;
		
	}
	
}