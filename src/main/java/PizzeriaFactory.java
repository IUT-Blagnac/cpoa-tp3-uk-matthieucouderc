
public class PizzeriaFactory {
	
	private PizzeriaFactory uniqueInstance ;
	
	public PizzeriaFactory getInstance() {
		return uniqueInstance;
	}
	
	private PizzeriaFactory() {
		
	}
	
	
}
