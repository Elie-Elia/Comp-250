
public class SeasonalFruit extends Fruit {
	public SeasonalFruit(String fruitname, double weight, int price) {
		super(fruitname, weight, price);
		
	}
	public int getCost() {
		int cost = (int) (super.getCost()*0.85);
		return cost;
		
	}

}
