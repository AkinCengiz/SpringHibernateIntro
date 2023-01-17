package SpringIntro;

public class CustomerManager implements ICustomerService {
	
	
	private ICustomerDal customerDal;
	
	/*
	//Constructor Injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	*/
	
	//Setter Injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		//i� kurallar�
		customerDal.add();
	}

	
}
