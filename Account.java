
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
     public ArrayList <withdrawal> withdrawalArray = new ArrayList<>(); 
     public ArrayList <Lodgement> LodgementArray = new ArrayList<>();
     public ArrayList <transactions> transactionArray = new ArrayList<>();
     withdrawal withdrawal;
     Lodgement lodgement;
     String line;

     	
     
    public static void main( String[] args ) {
        Account frame = new Account();
        frame.setVisible(true);
    }
	    
	    
	    Container pane = getContentPane();
	    
	   

	    public Account() {
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
	      	
	        @SuppressWarnings("unchecked")
			public void addWithdraw(){
	        //withdraw = new ArrayList<withdraw>();	
	         
	      	
	      	String date  = JOptionPane.showInputDialog("Enter the date: "); 
	      	
	      	double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount Withdrawen: "));
	      						
		    withdrawal withdrawalArray = new withdrawal(withdrawal.getTransType(), date, amount, withdrawal.getBalance(), withdrawal.getBankPin());
		    ((List<withdrawal>) withdrawalArray).add(withdrawalArray);
	      	JOptionPane.showMessageDialog(null,
	      			"\nTransaction added successfully \nWithdraw Details: \nDate:" +
	      	withdrawal.getDate() +"\nAmount Withdrawen:" + withdrawal.getAmount());
	      		                                            
	        } 
	        
	        @SuppressWarnings("unchecked")
			public void addLodge(){
	        //Lodge = new ArrayList<Lodge>();	
	         
	      	
	      	String date  = JOptionPane.showInputDialog("Enter the date: "); 
	      	
	      	double amount = Double.parseDouble(JOptionPane.showInputDialog("Amount Lodged: "));
	      						
		    Lodgement LodgementArray = new Lodgement(lodgement.getTransType(), date, amount, lodgement.getBalance(), lodgement.getBankPin());
	      	((List<Lodgement>) LodgementArray).add(LodgementArray);
	      	JOptionPane.showMessageDialog(null,
	      			"\nTransaction added successfully \nLodgement Details: \nDate:" +
	      	date +"\nAmount Lodged:" + amount);
	      		                                            
	        }     	
	    public void newSystem (){
	      	
	      	withdrawalArray = new ArrayList<withdrawal> ();
	      	LodgementArray = new ArrayList<Lodgement>();
	      		      	
	    }
	    
	      @SuppressWarnings("unchecked")
		public void actionPerformed (ActionEvent e)
	      {
	    	  if (e.getActionCommand().equals ("withdraw"))
	    	  {
	    		  addWithdraw();
	    		  try
	    		  {
	      	   	 	saveWithdraw();
	    		  }
	    		   catch(IOException x)
	    		  {
	    			  x.printStackTrace();
	    		  }
	    	  }
	      	
	      
	      	   
	      	   else if(e.getSource().equals ("lodge"))
	      	   {
	      		   addLodge(); 
	      		   try 
	      		   {
	      			   saveLodge();
		      	   }
	      		   
	      		   catch(IOException x)
	      		   {
	      			   x.printStackTrace();
	      		   }
	      		   
	      	   }
	      
	      
	      		   else if(e.getSource().equals("statement"))
	      		   {
	      			 try{
	      		      	}
	      			 catch(Exception x){x.printStackTrace();}
	      			
	      			 
	      			 for(withdrawal t:withdrawalArray && lodgement l:todgementArray)
	      		   }
	      				 
	      				 if(t.getBankPinLogin().equals(bankPin){
	      					Open();     				
	      				 }
	      			 }
	      			   
	      		   }
	      	
	      		   else
	      			   showMessage("Did not work");
	        	
	      	   
	    		  }
	      public void saveWithdraw() throws IOException {
	        	ObjectOutputStream os;
	        	os = new ObjectOutputStream(new FileOutputStream ("transaction.dat"));
	        	os.writeObject(withdrawalArray);
	        	os.close();
	      }
	      public void saveLodge() throws IOException {
	        	ObjectOutputStream os;
	        	os = new ObjectOutputStream(new FileOutputStream ("transaction.dat"));
	        	os.writeObject(LodgementArray);
	        	os.close();
	      }
	      public void Open(){
	    	  while((line = in.readLine()) != null)
	    	  {
	    	      System.out.println(line);
	    	  }
	    	  in.close();
	    	  
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
	    
	    
	  
