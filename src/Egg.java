
public class Egg extends MarketProduct{
	private int numberofeggs;
	private int priceofeggs;
	public Egg (String eggname, int numberofeggs, int priceofeggs) {
		super(eggname);
		this.numberofeggs=numberofeggs;
		this.priceofeggs=priceofeggs;

	}
	public int getCost() {
		return (int) (((double) priceofeggs/12)*numberofeggs);
	}
	public boolean equals(Object x) {
		if (x instanceof Egg && this.priceofeggs==((Egg) x).priceofeggs && this.getName()==((Egg) x).getName() && this.numberofeggs==((Egg) x).numberofeggs) {
			return true;
		}
		else {
			
		return false;
	}

	}
}



