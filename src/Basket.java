
public class Basket {
	private static MarketProduct[] MarketProducts;
	private int arraysize=0;
	public Basket () {
		MarketProducts = new MarketProduct[arraysize];
	}
	public MarketProduct[] getProducts() {
		MarketProduct[] copyofbasket = new MarketProduct[MarketProducts.length];
		for (int i = 0; i<MarketProducts.length;i++) {
			copyofbasket[i]=MarketProducts[i];
		}
		return copyofbasket;
	}

	public void add(MarketProduct x) {
		MarketProduct[] addarray= new MarketProduct[MarketProducts.length +1];
		for(int i=0;i<MarketProducts.length;i++) {
			addarray[i] = MarketProducts[i];
		}
		addarray[MarketProducts.length]=x;
		MarketProducts = addarray;

	}
	public boolean remove(MarketProduct x) {
		boolean result = false;
		if (MarketProducts.length == 0 || MarketProducts ==null) {
			result=false;
			return result;
		}
		else 
		{
		MarketProduct[] minusarray = new MarketProduct[MarketProducts.length -1];
		for (int i=0; i<MarketProducts.length;i++) {
			if((MarketProducts[i].equals(x)) && result==false) {
				result=true;
				for (int k=i;k<(MarketProducts.length)-1;k++) {
					MarketProducts[k]=MarketProducts[k+1];
				}
				
				for (int k=0;k<minusarray.length;k++) {
					minusarray[k]=MarketProducts[k];


				}
				MarketProducts=minusarray;
			}
		}
		
		return result;
		}
	}





	public void clear () {
		MarketProduct[] emptyarray = new MarketProduct[0];
		while (MarketProducts.length>0) {
		MarketProducts=emptyarray;
	}
	}
	public int getNumOfProducts() {
		int arraysize = MarketProducts.length;
		return arraysize;
	}
	public int getSubTotal() {
		int sum =0;
		if (MarketProducts!=null) {
			for (int i=0; i<MarketProducts.length;i++) {
				int cost = (MarketProducts[i].getCost());
				sum+=cost;
			}
		}
		return sum;
	}
	public int getTotalTax() {
		int sum = 0;
		int endtax=0;
		if (MarketProducts!=null) {
			for (int i=0; i<MarketProducts.length; i++) {
				if (MarketProducts[i] instanceof Jam) {
					sum+=MarketProducts[i].getCost();
				}
			}
			endtax = (int) (.15 * sum);
			}
		return endtax;
		}
		

	public int getTotalCost() {
		return (getSubTotal() + getTotalTax());
	}
	public String toString() {
		String receipt ="";
		String productlist ="";
		if (MarketProducts!=null) {
			for (int i=0;i<MarketProducts.length;i++) {
				productlist+=((MarketProducts[i].getName()) +"\t"+ (helper(MarketProducts[i].getCost())));
				productlist+="\n";
			}
			receipt+=productlist;
			receipt+="\n";
			receipt+="Subtotal"+"\t"+helper(getSubTotal());
			receipt+="\n";
			receipt+="Total Tax"+"\t"+helper(getTotalTax());
			receipt+="\n \n";
			receipt+="Total Cost"+"\t" +helper(getTotalCost());
		}
		return receipt;
	}
	public String helper(double numberincents) {
		String numrepresentation = "";
		if (numberincents <=0) {
			numrepresentation = "-";
		}
		else {
		String representation = String.format("%, .2f",numberincents/100);
		numrepresentation = "$"+representation;
		
		}
		return numrepresentation;
	}
	
	
}


