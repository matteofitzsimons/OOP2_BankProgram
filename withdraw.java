
public class withdraw {
	//setting attributes
		private String transType ;
		private String date;
		private double amount;
		private double balance;


		
		//Constructor
		public withdraw(){
			setTransType("withdraw");
			setDate("unkown");
			setAmount(0);
			setBalance(0);


		}
			
		public withdraw(String transType, String date, double amount, double  balance)
		{

			this.transType = transType;
			this.date = date;
			this.amount = amount;
			this.balance = balance;
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
		
		
		//accessor method
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
		
		//to string method
		public String toString()
		{
			return "Transaction:"+getTransType() +"\nDate of Withdrawal"+getDate()+"\nAmount:%.2f"+getAmount()+"\nNew Balance:%.2f"+getBalance();
			
		}

}
