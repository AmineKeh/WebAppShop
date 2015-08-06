package user;

import product.ShopingCart;

public class User {

	String userName;
	String password;
	String address;
	String City;
	String Zip;
	ShopingCart userCart;
	
	
	
	
	public void Pay(){
		
		
		
		
	}




	public String getUserName() {
		return userName;
	}




	public void setUserName(String userName) {
		this.userName = userName;
	}




	public String getPassword() {
		return password;
	}




	public void setPassword(String password) {
		this.password = password;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getCity() {
		return City;
	}




	public void setCity(String city) {
		City = city;
	}




	public String getZip() {
		return Zip;
	}




	public void setZip(String zip) {
		Zip = zip;
	}




	public ShopingCart getUserCart() {
		return userCart;
	}




	public void setUserCart(ShopingCart userCart) {
		this.userCart = userCart;
	}
	
	
	
	
	
}
