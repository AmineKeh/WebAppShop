package product;

import java.util.HashMap;
import java.util.Map;

public class ShopingCart implements Productlist {

	private static final Map<Product, Integer> cardProductsMap = new HashMap<Product, Integer>();

	public void addProduct(Product prd, Integer counter) {

		cardProductsMap.put(prd, counter);

	}

	public void addProduct(Product prd) {

		int counter = 0;
		boolean isFound = cardProductsMap.containsKey(prd);

		if (isFound) {

			counter = cardProductsMap.get(prd) + 1;
			cardProductsMap.put(prd, counter);

		} else {
			cardProductsMap.put(prd, 1);
		}

	}

	@Override
	public String showProducts() {
		// TODO Auto-generated method stub

		return cardProductsMap.toString();

	}
	
	

	public void removeProduct(Product prd) {
		
		cardProductsMap.remove(prd);
		

	}

	
	
	public void removeProduct(Product prd, Integer numberToDel) {
		
		
		int counter = cardProductsMap.get(prd);
		
		counter = counter - numberToDel;
		
		
		cardProductsMap.put(prd, counter);
		

	}

}
