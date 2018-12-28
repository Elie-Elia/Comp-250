
public class Customer {
	private String name;
	private int balance;
	private Basket goods;
	public Customer(String customername, int balance){
		this.name=customername;
		this.balance=balance;
		goods = new Basket();
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public Basket getBasket() {
		return goods;
	}
	public int addFunds(int funds) {
		if(funds<0) {
			throw new IllegalStateException ("You cannot add negative funds");
		}
		else {
			balance=funds+balance;
			return balance;
		}
	}
		public void addToBasket(MarketProduct product){
			goods.add(product);
			
		}
		public boolean removeFromBasket(MarketProduct product) {
			if(goods.remove(product)==true) {
				return true;
			}
			else {
				return false;
			}
		}
		public String checkOut() {
			String customerreceipt ="";
			int tc = goods.getTotalCost();
			if(balance < tc) {
				throw new IllegalArgumentException("Your balance is not enough to cover the total cost of your basket");
			}
			else {
				balance = balance - tc;
				customerreceipt+=goods.toString();
				goods.clear();
				return customerreceipt;
			}
		}	
	}

