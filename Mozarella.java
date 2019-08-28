package dp.decorator;

public class Mozarella extends ToppingDecorator {
	public Mozarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding dough...");
		System.out.println("Adding cheese...");
	}
	public String getDescription() {return unfinishedPizza.getDescription() + ", Mozarella";}
	public double getCost() {return unfinishedPizza.getCost() + 0.50;}
}
