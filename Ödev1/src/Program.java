
public class Program {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.GiveCredit();
	}
}

interface ICreditManager {
	void Calculute();
	void Save();
}

abstract class BaseCreditManager implements ICreditManager{
	@Override
	public abstract void Calculute();

	@Override
	public void Save() {
		System.out.println("Kredi verildi");
	}
}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void Calculute() {
		System.out.println("Öğretmen kredisi hesaplandı");
	}
}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager{

	@Override
	public void Calculute() {
		System.out.println("Asker kredisi hesaplandı");
	}
}

class CreditManager {
	public void Calculute() {
		System.out.println("Hesaplandı");
	}
	
	public void Save() {
		System.out.println("Kredi verildi");
	}
}

class Customer {
	public Customer() {
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
	public int Id;
	public String city;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

class Person extends Customer {
	public String FirstName;
	public String LastName;
	public String NationalIdentity;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getNationalIdentity() {
		return NationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		NationalIdentity = nationalIdentity;
	}
}

class Company extends Customer {
	public String CompanyName;
	public String TaxNumber;

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}

	public String getTaxNumber() {
		return TaxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		TaxNumber = taxNumber;
	}
}

//Katmanlı Mimariler

class CustomerManager{
	
	private Customer _customer;
	private ICreditManager _creditManager;	
	
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;
	}
	
	public void Save() {
		System.out.println("Müşteri kaydedildi : ");
	}
	
	public void Delete() {
		System.out.println("Müşteri silindi : ");
	}
	
	public void GiveCredit() {
		_creditManager.Calculute();
		System.out.println("Kredi Verildi");
	}
}








