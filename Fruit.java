
public class Fruit extends MarketProduct{
	private double weight;
	private int price;
	public Fruit(String fruitname, double weight, int price) {
		super(fruitname);
		this.weight=weight;
		this.price=price;
	}
	public int getCost() {
		return (int) (price*weight);
	}
	public boolean equals(Object x) {
		if (x instanceof Fruit && this.price==((Fruit) x).price && this.getName()==((Fruit) x).getName() && this.weight==((Fruit) x).weight) { 
			return true;
		}
		else {	
			return false;
		}
	}
}
