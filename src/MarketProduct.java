
public abstract class MarketProduct {
	private String productname;
	public MarketProduct(String productname) {
		this.productname = productname;
	}
	public final String getName() {
		return productname;
	}
	public abstract int getCost();
	public abstract boolean equals(Object x);
}
