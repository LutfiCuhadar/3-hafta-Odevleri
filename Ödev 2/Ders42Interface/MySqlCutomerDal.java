package Ders42Interface;

public class MySqlCutomerDal implements ICustomerDal,IRepository{

	@Override
	public void add() {
		System.out.println("My sql eklendi");
	}

}
