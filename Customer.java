import java.io.Serializable;

/**
 * 
 * @author Matteo
  	 * Setting attributes for Customer class 
 	 * @param name
	 * @param dob
	 * @param bankPin
	 * @param bankNumber
	 * @param balance
 */

@SuppressWarnings("serial")
public class Customer implements Serializable {
	//setting attributes
	private String name;
	private String dob;
	private int bankPin;
	private int bankNumber;
	private double balance;

/**
	 * 	Constructor - Assigning default values to the set attributes
	 * @param name
	 * @param dob
	 * @param bankPin
	 * @param bankNumber
	 * @param balance
 */
	//Constructor
	public Customer(){
		setName("unknown");
		setDob("unkown");
		setBankPin(0);
		setBankNumber(0);
		setBalance(0);

	}
	/**
	 * Multiple argument constructor for Customer class
	 * @param name
	 * @param dob
	 * @param bankPin
	 * @param bankNumber
	 * @param balance
	 */
	public Customer(String name, String dob, int bankPin, int bankNumber, double balance)
	{
		this.name = name;
		this.dob = dob;
		this.bankPin = bankPin;
		this.bankNumber = bankNumber;
		this.balance = balance;
	}

	/**
	 * mutator method for name
	 * @param name
	 */
	//mutator methods
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * mutator method for dob
	 * @param dob
	 */
	public void setDob(String dob)
	{
		this.dob = dob;
	}
	/**
	 * mutator method for bankPin
	 * @param bankPin
	 */
	public void setBankPin(int bankPin)
	{
		this.bankPin = bankPin;
	}
	/**
	 * mutator method for bankNumber
	 * @param bankNumber
	 */
	public void setBankNumber(int bankNumber)
	{
		this.bankNumber = bankNumber;
	}
	/**
	 * Mutator method for balance
	 * @param balance
	 */
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	
	/**
	 *  Accessor method for name
	 * @return String name
	 */	
	//accessor method
	public String getName()
	{
		return name;
	}
	/**
	 * Accessor method for dob
	 * @return String dob
	 */
	public String getDob()
	{
		return dob;
	}
	/**
	 * Accessor method for bankPin
	 * @return int bankPin
	 */
	public int getBankPin()
	{
		return bankPin;
	}
	/**
	 *Accessor method for ankNumber 
	 * @return int bankNumber
	 */
	public int getBankNumber(){
		return bankNumber;
	}
	/**
	 * Accessor method for balance
	 * @return double balance
	 */
	public double getBalance()
	{
		return balance;
	}

/**
 * toString method for Customer class
 * @return getName, getDob, getBankPin, getBankNumber, getBalance
 */
	
	//to string method
	public String toString()
	{
		return "name: "+getName()+"\nDate Of Birth:"+getDob() +"\nBank Pin:"+getBankPin()+"\nBank Number:"+getBankNumber()+"\nBalance:%.2f"+getBalance();
		
	}
	

	

}


