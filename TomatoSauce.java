package dp.decorator;

public class TomatoSauce extends ToppingDecorator {

	public TomatoSauce(Pizza newPizza) {
		super(newPizza);
		
		System.out.println("Adding sauce... (what kind of dummy puts sauce on after cheese?)");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	
	public String getDescription(){
		
		return unfinishedPizza.getDescription() + ", tomato sauce";
		
	}
	
	public double getCost() {
		System.out.println("Cost of Sauce: " + 0.35);
		return unfinishedPizza.getCost() + 0.35;
	}
}
