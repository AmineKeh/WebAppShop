package product;

import java.util.List;

public class ProductCatalogue implements Productlist {

	
	List<Product> products;
	
	
	@Override
	public void showProducts() {

		
		
		for (Product product : products) {
			
			System.out.println("Product name : " + product.getName());
			System.out.println("Product price : " + product.getPrice());
			System.out.println("Product Image : " + product.getImage());

			
		}
		

	}

}
