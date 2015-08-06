package product;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalogue implements Productlist {

	
	List<Product> products;
	public ProductCatalogue() {
		products = new ArrayList<Product>();
		products.add(new Product("Book 1","$5.00",""));
		products.add(new Product("Book 2","$7.00",""));
		products.add(new Product("Book 3","$3.00",""));
		products.add(new Product("Book 4","$4.00",""));
	}
	
	@Override
	public String showProducts() {

		String output = "";
		
		for (Product product : products) {
			
			output +=("Product name : " + product.getName()+"<br />");
			output +=("Product price : " + product.getPrice()+"<br />");
			output +=("Product Image : " + product.getImage()+"<br />");

			
		}
		
		return output;
	}

}
