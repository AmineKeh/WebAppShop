package product;

public class Product {
	
	String name;
	String price;
	String image;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	@Override
	public String toString() {


		return "Name : " + name + "Price : " + price + "Image :" + image; 
		
	}

	

	

}
