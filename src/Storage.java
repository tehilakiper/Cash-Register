//t//this class contains all the products for sell in the register
public class Storage {

	//create objects of product 
    Prodact nothing = new Prodact (0, "");
	
	Prodact milk = new Prodact (10, "milk");

	Prodact meat = new Prodact (50, "meat");

	Prodact eggs = new Prodact (12, "eggs");

	Prodact tomato = new Prodact (1, "tomato");

	Prodact cucmber = new Prodact (2, "cucamber");

	Prodact lettos = new Prodact (3, "lettos");

	Prodact chocolate = new Prodact (8, "chocolate");

	Prodact yogurt = new Prodact (5, "yogurt");

	Prodact apple = new Prodact (10, "apple");

	Prodact graps = new Prodact (50, "graps");

	Prodact cheaken = new Prodact (10, "cheaken");

	Prodact butter = new Prodact (50, "butter");


	//save the products in array
	private Prodact procdactStorage [] = {milk,meat, eggs, tomato, cucmber, lettos, chocolate, yogurt, apple, graps, cheaken, butter, nothing};

	/**
	 * this method finds the object of product by its name
	 * @param name the name of the product
	 * @return the object of product with the same name
	 */
	public  Prodact getProdactByName(String name){

		//looking for the product in the array
		for (int i = 0; i < 13; i++) {

			if (procdactStorage[i].getProdactName().equals(name))

				return procdactStorage[i];
		}
		//if product does not exist returns "nothing" 
		return procdactStorage[12];
	}
	
	
}
