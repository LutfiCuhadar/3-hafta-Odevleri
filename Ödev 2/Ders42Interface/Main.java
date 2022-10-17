package Ders42Interface;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new PostgresqlCustomerDal());
		customerManager.add();
	}

}
