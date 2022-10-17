package Ders42Interface;

public class PostgresqlCustomerDal implements ICustomerDal{

	@Override
	public void add() {
		System.out.println("Postgresql eklendi");
	}
	
}
