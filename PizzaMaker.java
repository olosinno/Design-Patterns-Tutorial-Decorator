package dp.decorator;

public class PizzaMaker {
	public static void main(String[] args) {
		Pizza basicPizza = new TomatoSauce(new Mozarella(new PlainPizza()));
		System.out.println("Pizza ingredients: " + basicPizza.getDescription());
		System.out.println("Price: " + basicPizza.getCost());
	}
}
