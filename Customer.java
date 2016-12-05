
public class Customer {
	//setting attributes
	private String name;
	private int dob;
	private int number;

	
	//constructer
	public Customer(){
		setName("unknown");
		setDob(0);
		setNumber(0);

	}
		
	public Customer(String name, int dob, int number)
	{
		this.name = name;
		this.dob = dob;
		this.number = number;
	}
	//mutator methods
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDob(int dob)
	{
		this.dob = dob;
	}
	public void setNumber(int number)
	{
		this.number = number;
	}
	
	
	//accessor method
	public String getName()
	{
		return name;
	}
	public int getDob()
	{
		return dob;
	}
	public int getNumber()
	{
		return number;
	}
	
	//to string method
	public String toString()
	{
		return "name: "+getName()+"\nDate Of Birth:"+getDob() +"\nNumber:"+getNumber();
	}

}


