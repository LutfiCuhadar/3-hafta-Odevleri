package Ders33GetterAndSetter;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"hp",1,1.0);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
