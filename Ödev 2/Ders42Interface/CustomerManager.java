package Ders42Interface;

public class CustomerManager {
	
	ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//iş kodları
		customerDal.add();
	}
}
