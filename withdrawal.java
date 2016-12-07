import java.io.Serializable;
@SuppressWarnings("serial")
public class withdrawal implements Serializable {
	//setting attributes
		private String transType ;
		private String date;
		private double amount;
		private double balance;
		private int bankPin;
		Customer customer;
		BankDriver bankDriver;
		
		// customer.getthibgamajig()

		
		//Constructor
		public withdrawal(){
			setTransType("withdraw");
			setDate("unkown");
			setAmount(0);
			setBalance(0);
			setBankPin(BankDriver.getBankPinLogin());


		}
			
		public withdrawal(String transType, String date, double amount, double  balance, int bankPin)
		{

			this.transType = transType;
			this.date = date;
			this.amount = amount;
			this.balance = balance;
			this.bankPin = bankPin;
		}
		//mutator methods

		public void setTransType(String transType)
		{
			this.transType = transType;
		}
		public void setDate(String date)
		{
			this.date = date;
		}

		public void setAmount(double amount)
		{
			this.amount = amount;
		}
		public void setBalance(double balance)
		{
			this.balance = balance;
		}
		public void setBankPin(int bankPin)
		{
			this.bankPin = bankPin;
		}
		
		
		//Accessory method
		public String getTransType()
		{
			return transType;
		}
		public String getDate()
		{
			return date;
		}
		public double getAmount()
		{
			return amount;

		}
		public double getBalance()
		{
			return balance;
		}
		public int getBankPin()
		{
			return bankPin;
		}
		
		//to string method
		public String toString()
		{
			return "Transaction:"+getTransType() +"\nDate of Withdrawal"+getDate()+"\nAmount:%.2f"+getAmount()+"\nNew Balance:%.2f"+getBalance()+
					"Bank Pin:"+getBankPin();
			
		}

}
