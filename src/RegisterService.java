import java.util.Scanner;

/**
 * this class uses all of the other classes in order to give register service
 */
 public class RegisterService {
	

	public static void main(String[] args) {

		//new object of register
		Register reg = new Register();
		
		//new object of storage
		Storage storage = new Storage();

		// the amount that bought of each product
		int sumOfProdact;

		//the product that bought
		String prodact="";

		//this loop resets the register back to the main menu after each register action
		for(int i = 0; i<=200000; i++) {

			//menu options
			System.out.println("-to start a new buy, enter 'new costumer' \n-to reset the register enter 'reset' \n-to see register sum enter 'register sum'");

			Scanner scan = new Scanner(System.in);
			//enter action from the menu 
			String action = scan.nextLine();
			if(action.equals("reset")) {
				
				//reset the loop
				i=0;
		       
				//reset the register
                reg = new Register();
			}
			
			else if(action.equals("register sum")){
				//return the amount of cash in the register
				System.out.println(reg.getRegisterSum());
				
			}
			//starts a new buy
			else if(action.equals("new costumer")){
			//this loop entering new product to the current buy until entering 'check'
			while(!prodact.equals("check")) {

				scan = new Scanner(System.in);
				
				System.out.println("enter the prodact from the following list that you want to buy?\n");

				System.out.println("milk,meat, eggs, tomato, cucamber, lettos, chocolate, yogurt, apple, graps, cheaken, butter\n");

				//entering product from the listed storage
				prodact = scan.nextLine();

				//check out from the buy
				if (prodact.equals("check") )

					break;

				System.out.println("\nhow many units do you want?\n");
				
				//entering the amount of each product
				sumOfProdact = scan.nextInt();

				//adding the product to the buy
				reg.addProdact(storage.getProdactByName(prodact), sumOfProdact);

				System.out.println("\nto check out eneter 'check', else- \n");

			}
			scan = new Scanner(System.in);

			prodact = "";

			String R = reg.PrintReceipt();

			int sum = reg.totalSum();

			//returning the buy cost
			System.out.println(  "\n" + "you need to pay total of:" + sum+"\n");

			//accepting the pay
			System.out.println("\nenter the amount of cash you are puting in the register\n");

			int payed = scan.nextInt();

			int change = reg.payment(payed);

			//informing about the change sum
			System.out.println("\nthe change is:" + change); 

			//returning the receipt 
			System.out.println("\nthe receipt:\n" + R + "\ntotal price: " + sum
					+ "\n eccepted: " + payed + "\n returned: "+ change+ "\n\nregister sum: "+ reg.getRegisterSum()+"\n");

			}
		}

	}

}
