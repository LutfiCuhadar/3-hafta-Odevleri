package Ders41Abstract2;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		customerManager.dataManager = new MySqlDatabaseManager();
		customerManager.getCustomers();
	}

}
