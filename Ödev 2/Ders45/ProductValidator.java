package Ders45;

public class ProductValidator {
	
	static {
		System.out.println("Static Yapıcı blok çalıştı");
	}
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public boolean isValid(Product product) {
		if (product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
}




