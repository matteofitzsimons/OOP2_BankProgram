
/*JFrame Driver for the account interface*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*; 
import java.util.*;
import java.util.List; 


@SuppressWarnings("serial")
public class Account extends JFrame implements ActionListener{
     public JButton b1,b2,b3;
     public ArrayList <withdrawal> withdrawals = new ArrayList<>(); 
     public ArrayList <Lodgement> Lodgements = new ArrayList<>();
     public ArrayList <transactions> transactions = new ArrayList<>();
     withdrawal withdrawal;
     Lodgement lodgements;

     	
     
    public static void main( String[] args ) {
        Account frame = new Account();
        frame.setVisible(true);
    }
	    
	    
	    Container pane = getContentPane();
	    
	   

	    public Account( ) {
	        newSystem();
	        
	        ImageIcon img = new ImageIcon("");
			setIconImage(img.getImage());
		
	        setTitle( "Account Page" );
	        setSize( 1300,1000 );
	        setLocationRelativeTo(null);
	        setLayout(new FlowLayout());
	        
	        b1 = new JButton("Withdraw");
	        pane.add(b1);
	        b1.addActionListener(this);
	       
	        b2 = new JButton("Lodge");
	        pane.add(b2);
	        b2.addActionListener(this);
	        
	        b3 = new JButton("Statement");
	        pane.add(b3);
	        b3.addActionListener(this);
	        
	        
	        JLabel imageLabel = new JLabel(new ImageIcon(""));
			pane.add(imageLabel);
			
	        setDefaultCloseOperation( EXIT_ON_CLOSE );
	        
	     }  
	      	
	        public void addWithdraw(){
	        //withdraw = new ArrayList<withdraw>();	
	         
	      	
	      	String date  = JOptionPane.showInputDialog("Enter the date: "); 
	      	
	      	double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount Withdrawen: "));
	      						
		    withdrawal withdrawal = new withdrawal(transType, date, amount, balance, bankPin);
	      	withdrawals.add(withdrawal);
	      	JOptionPane.showMessageDialog(null,
	      			"\nTransaction added successfully \nWithdraw Details: \nDate:" +
	      	withdrawal.getDate() +"\nAmount Withdrawen:" + withdrawal.getAmount());
	      		                                            
	        } 
	        
	        @SuppressWarnings("unchecked")
			public void addLodge(){
	        //Lodge = new ArrayList<Lodge>();	
	         
	      	
	      	String date  = JOptionPane.showInputDialog("Enter the date: "); 
	      	
	      	double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount Lodged: "));
	      						
		    Lodgement Lodgements = new Lodgement(transType, date, amount, balance, bankPin);
	      	((List<Lodgement>) Lodgements).add(Lodgements);
	      	JOptionPane.showMessageDialog(null,
	      			"\nTransaction added successfully \nLodgement Details: \nDate:" +
	      	date +"\nAmount Lodged:" + amount);
	      		                                            
	        }     	
	    public void newSystem (){
	      	
	      	withdrawals = new ArrayList<withdrawal> ();
	      	Lodgements = new ArrayList<Lodgement>();
	      		      	
	    }
	    
	      @SuppressWarnings("unchecked")
		public void actionPerformed (ActionEvent e)
	      {
	    	  if (e.getSource().equals ("b1"))
	    	  {
	    		  addWithdraw();
	    		  try
	    		  {
	      	   	 
	      	      	ObjectOutputStream os;
	      	      	os = new ObjectOutputStream(new FileOutputStream ("transaction.dat"));
	      	      	os.writeObject(withdrawals);
	      	      	os.close(); 
	    		  }
	    		  
	    		  catch(Exception x)
	    		  {
	    			  x.printStackTrace();
	    		  }
	    	  }
	      	
	      
	      	   
	      	   else if(e.getSource().equals ("b2"))
	      	   {
	      		   addLodge(); 
	      		   try 
	      		   {
		      	      	ObjectOutputStream os;
		      	      	os = new ObjectOutputStream(new FileOutputStream ("transaction.dat"));
		      	      	os.writeObject(lodgements);
		      	      	os.close();
		      	   }
	      		   
	      		   catch(Exception x)
	      		   {
	      			   x.printStackTrace();
	      		   }
	      		   
	      	   }
	      
	      
	      		   else if(e.getSource().equals("b3"))
	      		   {
	      			 try{
	      		      	  ObjectInputStream is;
	      		      	  is = new ObjectInputStream(new FileInputStream ("transaction.dat"));
	      		          transactions  = (ArrayList<transactions>) is.readObject();
	      		      	  is.close();
	      		      	}
	      			 catch(Exception x)
	      			 {
	      				 x.printStackTrace();
	      			 }
	      			   
	      		   }
	      	
	      		   else
	      			   showMessage("Did not work");
	        	
	      	   
	    		  }

	      public void showMessage (String s)
	    {
	      	JOptionPane.showMessageDialog(null,s);
	      }
	      
	      public void showMessage (JTextArea s)
	      {
	      	JOptionPane.showMessageDialog(null,s);
	      }
	      

			
		}
	    
	    
	  
