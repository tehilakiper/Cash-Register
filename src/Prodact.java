//this class represents a product
public class Prodact {

	private int prodactPrice;

	private String prodactName;

	public Prodact (int prodactPrice, String prodactName) {


		if (prodactPrice >= 0)

			this.prodactPrice = prodactPrice;

		else

			this.prodactPrice = 0;

		if(prodactName != "")

			this.prodactName = prodactName;
		else

			this.prodactName = "";
	}

	public Prodact() {

		this.prodactPrice = 0;

		this.prodactName = "";

	}

	public int getProdactPrice() {

		return this.prodactPrice;
	}

	public String getProdactName() {

		return this.prodactName;
	}

	public void setProdactPrice(int price) {
		if (price > 0)
			prodactPrice = price;
	}

	public void setProdactName(String name) {
		if(name !="")
			prodactName = name;
	}

	/**
	 * create a string that represents the product details
	 */
	public String toString () {

		return "prodact name: " + prodactName   + ", prodact price: " + prodactPrice;
	}


}
