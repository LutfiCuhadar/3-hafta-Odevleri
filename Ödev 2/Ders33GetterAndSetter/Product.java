package Ders33GetterAndSetter;

public class Product {
	
	public Product(int id, String Brand, int Stock, double Price) {
		this.id = id;
		this.Brand = Brand;
		this.Stock = Stock;
		this.Price = Price;
	}
	
	public Product() {
		
	}
	
	private int id;
	private String Brand;
	private int Stock;
	private double Price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) { 
		this.id = id;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
