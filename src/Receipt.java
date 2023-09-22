//this class represents a line in the buy receipt
public class Receipt { 

	private Prodact prodact; //the current product

	private int prodactAmount;	 //the number of units of this product

	private int prodactSumPrice; //the current product total price

	// line details constructor
	public Receipt( Prodact prodact , int prodactAmount) {

		this.prodact = prodact;

		this.prodactAmount = prodactAmount;

		this.prodactSumPrice = prodactAmount*prodact.getProdactPrice();

	}

	//line empty constructor
	public Receipt() {

		this.prodact = new Prodact();

		this.prodactAmount =0;

		this.prodactSumPrice =0;

	}

	
	public void setProdactsAmount(int sum) {

		this.prodactAmount = sum;

		this.prodactSumPrice = sum*prodact.getProdactPrice();
	}

	public void setProdact(Prodact prodact) {

		this.prodact = new Prodact(prodact.getProdactPrice(), prodact.getProdactName());

		this.prodactSumPrice = prodactAmount*prodact.getProdactPrice();
	}


	public Prodact getProdact() {

		return this.prodact;
	}

	public int getProdactAmount() {

		return this.prodactAmount;
	}

	public int getProdactSumPrice() {

		return this.prodactSumPrice;
	}

	/**
	 * creating a string of line in the receipt
	 * @return line in the receipt
	 */
	public String getLine() {

		return ( prodact.toString() + "  " + "number of prodacts: " +prodactAmount + "  " + ", total prodact price: " + prodactSumPrice);
	}


}
