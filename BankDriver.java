/*JFrame Driver for my bank program */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.util.List; 


@SuppressWarnings("serial")
public class BankDriver extends JFrame implements ActionListener{
     public JButton b1,b2;
     public ArrayList <Customer> Customers; 
     Customer Customer;
     public String name ="";
     public int bankPin;
     public String NameLogin;
		 public static int bankPinLogin;
     	
     
    public static void main( String[] args ) {
        BankDriver frame = new BankDriver();
        frame.setVisible(true);
    }
	    
	    
	    Container pane = getContentPane();
	    
	   

	    public BankDriver( ) {
	        newSystem();
	        
	        ImageIcon img = new ImageIcon("");
	        @SuppressWarnings("unused")
			JLabel background=new JLabel(new ImageIcon("C:\\Users\\Matteo\\Downloads\\bankbuilding.jpg"));

			setIconImage(img.getImage());
		
	        setTitle( "Home" );
	        setSize( 1300,1000 );
	        setLocationRelativeTo(null);
	        setLayout(new FlowLayout());
	        
	        b1 = new JButton("Login");
	        pane.add(b1);
	        b1.addActionListener(this);
	       
	        b2 = new JButton("Register Customer");
	        pane.add(b2);
	        b2.addActionListener(this);
	        
	        
	        JLabel imageLabel = new JLabel(new ImageIcon(""));
			pane.add(imageLabel);
			
	        setDefaultCloseOperation( EXIT_ON_CLOSE );
	        
	     }  
	      	
	        @SuppressWarnings("unchecked")
			public void addCustomer(){
	        Customers = new ArrayList<Customer>();	
	        
	      	String name = JOptionPane.showInputDialog("Enter Your name: ");
	      	
	      	String dob  = JOptionPane.showInputDialog("Enter Your dob: "); 
	      	
	      	int bankPin = Integer.parseInt(JOptionPane.showInputDialog("Enter Your bankPin: "));
	      						
			int bankNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Bank Number: "));
			
			double balance =  Double.parseDouble(JOptionPane.showInputDialog("Enter Your Balance: "));
			
			
		    Customer Customers = new Customer(name,dob,bankPin,bankNumber,balance);
	      	((List<Customer>) Customer).add(Customers);
	      	JOptionPane.showMessageDialog(null,
	      			"\nAccount added successfully" + "\nMember Details" +"\nnNmae:" + name + "\nDate of Birth:" + dob +                                          
                       "\nBank Pin:" + bankPin +"\nBank Number:" + bankNumber +"\n\nBalance:" + balance);
	      		                                            
	        }     	
	    public void newSystem (){
	      	
	      	Customers = new ArrayList<Customer> ();	
	      		      	
	      	}
	    public void actionPerformed (ActionEvent e) {
	      	if (e.getSource() == b1){
	      	 String nameLogin  = JOptionPane.showInputDialog("Enter Your Name: ");
			int bankPinLogin =  Integer.parseInt(JOptionPane.showInputDialog("Enter Your Pin Number: "));
			 
			      	try{
			      	  ObjectInputStream is;
			      	  is = new ObjectInputStream(new FileInputStream ("Customer.dat"));
			          Customer  = (Customer) is.readObject();
			      	  is.close();
			     }
			      	catch(Exception ex){}
					if (nameLogin == name && bankPinLogin == bankPin)
					{
						JFrame loggedIn = new JFrame("Account");
						loggedIn.setVisible(true);
					
					}
					else
					{
					showMessage("Login Failed");
					}		 	
	      	}
	      	
	      	else if (e.getSource()==("b2")){
	      		System.out.println("hello");
	      	   addCustomer();
	      	   try{
	      	      	ObjectOutputStream os;
	      	      	os = new ObjectOutputStream(new FileOutputStream ("Customer.dat"));
	      	      	os.writeObject(Customers);
	      	      	os.close(); 
	      	   		}
	      	
	      	   catch(Exception ex){}
	      	}
	      	
	      	
	      	//else
	      	  //showMessage("Did not work");
	      } 
	      	
	   
	      public void showMessage (String s){
	      	JOptionPane.showMessageDialog(null,s);
	      }
	      
	      public void showMessage (JTextArea s){
	      	JOptionPane.showMessageDialog(null,s);
	      }
   
	  /*    public void actionPerformed (ActionEvent e) {
	      	if (e.getSource() == b1){
	      		
	      	 NameLogin = JOptionPane.showInputDialog("Enter Your Name: ");
			 bankPinLogin =  Integer.parseInt(JOptionPane.showInputDialog("Enter Your bank pin: "));}
	      	
			
			if (Customer.getName() == NameLogin && Customer.getBankPin() == bankPinLogin  )
			{
				JFrame loggedIn = new JFrame("Account");
				loggedIn.setVisible(true);
			
			}
	      	
			else if
			{
			JOptionPane.showMessageDialog(null,"Login Failed");
			}
	      	
	      	else if (e.getSource() == b2){
	      	   addCustomer(); 
	      	}
	      	else
	      	  JOptionPane.showMessageDialog("Please Retry");
			{*/
	   public static int getBankPinLogin()
	    {
   	return bankPinLogin;
	    }
	    
	 }     



