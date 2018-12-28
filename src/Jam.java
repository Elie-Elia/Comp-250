
public class Jam extends MarketProduct{
	private int numberofjars;
	private int priceperjar;
	public Jam(String productname, int numberofjars, int priceperjar) {
		super(productname);
		this.numberofjars=numberofjars;
		this.priceperjar=priceperjar;
	}
	public int getCost() {
		return numberofjars*priceperjar;
	}
	public boolean equals(Object x) {
		if (x instanceof Jam && this.priceperjar==((Jam) x).priceperjar && this.getName()==((Jam) x).getName() && this.numberofjars==((Jam) x).numberofjars) { 
			return true;
		}
		else {
			return false;
		}
	}
}