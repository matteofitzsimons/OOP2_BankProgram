//
//Was going to use this class but decided to make two separate ones for: Withdrawal and lodgement
//
//
//
//
//
//
//

public class transactions {
	//setting attributes
		private int bankPin;
		private String transType ;
		private String date;
		private double amount;
		private double balance;
		Customer customer;
		BankDriver bankDriver;


		
		//Constructor
		public transactions(){
			setTransType("");
			setDate("unkown");
			setAmount(0);
			setBalance(0);
			setBankPin(BankDriver.getBankPinLogin());


		}
			
		public transactions(int bankPin, String transType, double amount, double  balance)
		{
			this.bankPin = bankPin;
			this.transType = transType;
			this.amount = amount;
			this.balance = balance;
		}
		//mutator methods
		public void setBankPin(int bankPin)
		{
			this.bankPin = bankPin;
		}
		public void setTransType(String transType)
		{
			this.transType = transType;
		}

		public void setAmount(double amount)
		{
			this.amount = amount;
		}
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		
		
		//accessor method
		public int getBankPin()
		{
			return bankPin;
		}
		public String getTransType()
		{
			return transType;
		}
		public double getAmount()
		{
			return amount;

		}
		public double getBalance()
		{
			return balance;
		}
		
		//to string method
		public String toString()
		{
			return "Bank pin: "+getBankPin()+"\nWithdrawal or Lodgement:"+getTransType() +"\nAmount:%.2f"+getAmount()+"\nNew Balance:%.2f"+getBalance();
			
		}

}
