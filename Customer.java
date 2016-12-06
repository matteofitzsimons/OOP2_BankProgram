
public class Customer {
	//setting attributes
	private String name;
	private String dob;
	private int bankPin;
	private int bankNumber;
	private double balance;

	
	//constructer
	public Customer(){
		setName("unknown");
		setDob("unkown");
		setBankPin(0);
		setBankNumber(0);
		setBalance(0);

	}
		
	public Customer(String name, String dob, int bankPin, int bankNumber, double balance)
	{
		this.name = name;
		this.dob = dob;
		this.bankPin = bankPin;
		this.bankNumber = bankNumber;
		this.balance = balance;
	}
	//mutator methods
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	public void setBankPin(int bankPin)
	{
		this.bankPin = bankPin;
	}
	public void setBankNumber(int bankNumber)
	{
		this.bankNumber = bankNumber;
	}
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
	//accessor method
	public String getName()
	{
		return name;
	}
	public String getDob()
	{
		return dob;
	}
	public int getBankPin()
	{
		return bankPin;
	}
	public int getBankNumber(){
		return bankNumber;
	}
	public double getBalance()
	{
		return balance;
	}
	
	//to string method
	public String toString()
	{
		return "name: "+getName()+"\nDate Of Birth:"+getDob() +"\nBank Pin:"+getBankPin()+"\nBank Number:"+getBankNumber()+"\nBalance:%.2f"+getBalance();
		
	}

	

}


