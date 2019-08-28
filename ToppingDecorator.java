package dp.decorator;

abstract class ToppingDecorator implements Pizza {
	protected Pizza unfinishedPizza;
	public ToppingDecorator(Pizza newPizza) {unfinishedPizza = newPizza;}

	public String getDescription() {return unfinishedPizza.getDescription();}
	public double getCost() {return unfinishedPizza.getCost();}
}
