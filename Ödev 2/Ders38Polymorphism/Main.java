package Ders38Polymorphism;

public class Main {

	public static void main(String[] args) {
		//BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), 
		//					   new EmailLogger(), new MainLogger(), new ProductLogger()};
		//for (BaseLogger logger:loggers) {
		//	logger.log("Log Mesajı");
		//}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		
	}

}
