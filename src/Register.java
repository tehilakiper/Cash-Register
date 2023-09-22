
public class Register {

	final int REGISTER_START_SUM = 0;

	private int registerSum; 

	private Receipt [] check = new Receipt[100000]; // a line in the receipt

	private int prodactsNum=-1; // current buy products counter


	/**
	 * register empty constructor
	 */
	public Register() {

		registerSum = REGISTER_START_SUM;


	}

	/**
	 * register constructor
	 */
	public Register(int registerSum) {

		this.registerSum = registerSum;
	}

	public void setRegisterSum(int sum) {

		if(sum >= 0)
		
		this.registerSum = sum;

	}

	/**
	 * adding product to the buy
	 * @param prodact the product to add to the buy
	 * @param prodactAmount the amount of the product that added
	 */
	public void addProdact(Prodact prodact, int prodactAmount) {

		//counter for number of products for current buy
		prodactsNum = prodactsNum+1;

		//make a line in the receipt for current product
		Receipt a = new Receipt(prodact, prodactAmount);

		//add product to array that represent the check
		check[prodactsNum]= a;

		
	}
	/**
	 * adding a string that represents the new line in the receipt for the new product
	 * @return the string that represents the receipt
	 */
	public String PrintReceipt() {

		String line = "" ;

		int i;

		//print the product in the the array
		for( i=0; i<=prodactsNum; i++) 

			line = line+" \n"+ check[i].getLine() ;


		//return the check
		return line  ;
	}
/**
 * finding sum of all of the products price
 * @return the current buy total price 
 */
	public int totalSum() {

		int sum = 0;

		int i;
		
		// sum products price
		for( i=0; i<=prodactsNum; i++) 

			sum = sum + check[i].getProdactSumPrice();

		return sum;

	}
	/**
	 * find the payment change and reset some details in order to start a new buy and updating register sum
	 * @param pay - the amount of cash entering the register
	 * @return the change needed return to the costumer
	 */

	public int payment(int pay) {

		int change=0;

		//calculating the change sum 
		change = pay-totalSum();

		//updating register sum
		registerSum = registerSum + totalSum();

		//reset the buy details

		check = new Receipt[100000];		

		//reseting products counter 
		prodactsNum=-1;

		return change;
	}

	/**
	 * returning the current amount of money in the register
	 */
	public int getRegisterSum() {

		return registerSum;
	}
}
