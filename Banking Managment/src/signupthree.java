import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public  class signupthree extends JFrame implements ActionListener{
	JRadioButton typetext,typetext1,typetext2,typetext3;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancle;
	String form;
	
	public signupthree(String form) {
		this.form=form;
		setLayout(null);
		JLabel jj=new JLabel("Page 3: Account Details");
		jj.setFont(new Font("Raleway",Font.BOLD,30));
		jj.setBounds(280, 20, 400, 40);
		add(jj);
		
		JLabel type=new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBackground(Color.WHITE);
		type.setBounds(100, 120, 200, 30);
		add(type);
		
		typetext=new JRadioButton("Saving Account");
		typetext.setFont(new Font("Raleway",Font.BOLD,16));
		typetext.setBounds(100, 160, 160, 25);
		add(typetext);
		
		typetext1=new JRadioButton("Current Account");
		typetext1.setFont(new Font("Raleway",Font.BOLD,16));
		typetext1.setBounds(100, 200, 160, 25);
		add(typetext1);
		

		typetext2=new JRadioButton("Recurring Deposite Account");
		typetext2.setFont(new Font("Raleway",Font.BOLD,16));
		typetext2.setBounds(350, 160, 160, 25);
		add(typetext2);

		typetext3=new JRadioButton("Fixed Deposite Account");
		typetext3.setFont(new Font("Raleway",Font.BOLD,16));
		typetext3.setBounds(350, 200, 160, 25);
		add(typetext3);
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(typetext);
		groupaccount.add(typetext1);
		groupaccount.add(typetext2);
		groupaccount.add(typetext3);

		JLabel cardnum=new JLabel("Your 16 digit card number");
		cardnum.setFont(new Font("Raleway",Font.BOLD,12));
		cardnum.setBackground(Color.WHITE);
		cardnum.setBounds(100, 275, 200, 30);
		add(cardnum);
		
		JLabel cardnum1=new JLabel("Card Number");
		cardnum1.setFont(new Font("Raleway",Font.BOLD,22));
		cardnum1.setBackground(Color.WHITE);
		cardnum1.setBounds(100, 250, 200, 30);
		add(cardnum1);
		
		JLabel cardnumse=new JLabel("XXXX-XXXX-XXXX-9906");
		cardnumse.setFont(new Font("Raleway",Font.BOLD,22));
		cardnumse.setBackground(Color.WHITE);
		cardnumse.setBounds(350, 250, 300, 30);
		add(cardnumse);
		
		JLabel pin=new JLabel("PIN");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBackground(Color.WHITE);
		pin.setBounds(100, 310, 200, 30);
		add(pin);
		JLabel pin2=new JLabel("Your 4 digit Pin");
		pin2.setFont(new Font("Raleway",Font.BOLD,12));
		pin2.setBackground(Color.WHITE);
		pin2.setBounds(100, 330, 200, 30);
		add(pin2);
		
		JLabel pin1=new JLabel("XXXX");
		pin1.setFont(new Font("Raleway",Font.BOLD,22));
		pin1.setBackground(Color.WHITE);
		pin1.setBounds(350, 310, 300, 30);
		add(pin1);
		
		JLabel service=new JLabel("Services Required");
		service.setFont(new Font("Raleway",Font.BOLD,22));
		service.setBackground(Color.WHITE);
		service.setBounds(100, 380, 200, 30);
		add(service);
		
		c1=new JCheckBox("ATM CARD");
		c1.setBackground(Color.WHITE);
		c1.setBounds(100, 430, 200, 30);
		add(c1);
		c2=new JCheckBox("Mobile Banking");
		c2.setBackground(Color.WHITE);
		c2.setBounds(350, 430, 200, 30);
		add(c2);
		c3=new JCheckBox("Internet Banking");
		c3.setBackground(Color.WHITE);
		c3.setBounds(100, 480, 200, 30);
		add(c3);
		
		c4=new JCheckBox("EMAIL & SMS Alerts");
		c4.setBackground(Color.WHITE);
		c4.setBounds(350, 480, 200, 30);
		add(c4);
		c5=new JCheckBox("Cheque Book");
		c5.setBackground(Color.WHITE);
		c5.setBounds(100, 530, 200, 30);
		add(c5);
		c6=new JCheckBox("E-Statment");
		c6.setBackground(Color.WHITE);
		c6.setBounds(350, 530, 200, 30);
		add(c6);
		
		c7=new JCheckBox("I hereby declears that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.WHITE);
		c7.setBounds(100, 570, 600, 20);
		add(c7);
		submit=new JButton("Submit");
		submit.setBackground(Color.BLUE);
		submit.setForeground(Color.WHITE);
		submit.setBounds(200, 610, 120, 30);
		submit.addActionListener(this);
		add(submit);
		
		cancle=new JButton("Cancle");
		cancle.setBackground(Color.BLUE);
		cancle.setForeground(Color.WHITE);
		cancle.setBounds(450, 610, 120, 30);
		cancle.addActionListener(this);
		add(cancle);
		 getContentPane().setBackground(Color.WHITE);
		
		setSize(850,820);
		setLocation(350, 0);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==submit)
		{
			String accounttype=null;
			if(typetext.isSelected())
			{
				accounttype="Saving Account";
			}
			else if (typetext1.isSelected()) {
				accounttype="Current Account";
				
			}
			else if (typetext2.isSelected()) {
				accounttype="Reccuring Deposite Account";
				
			}
			else if (typetext3.isSelected()) {
				accounttype="Fixed Deposit Account";
				
			}
			Random cardnumgen=new Random();
			String cardnumber=""+cardnumgen.nextLong(10000000000000L);
			
			Random pinnumgen=new Random();
			String pinnumber=""+pinnumgen.nextLong(9999);
			
			String facility="";
			if(c1.isSelected())
			{
				facility=facility+"ATM Card";
			}
			else if(c2.isSelected())
			{
				facility=facility+"Mobile Banking";
			}
			else if(c3.isSelected())
			{
				facility=facility+"Internet Banking";
			}
			else if(c4.isSelected())
			{
				facility=facility+"EMAIL & SMS Alerts";
			}
			else if(c5.isSelected())
			{
				facility=facility+"Cheque Book";
			}
			else if(c6.isSelected())
			{
				facility=facility+"E-Statment";
			}
			try {if(accounttype.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Account Type is Required");
			}
			else {
				conn conn=new conn();
				String query = "INSERT INTO Signupthree VALUES('" + form + "','" + accounttype + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                String query1= "INSERT INTO Login VALUES('" + form + "','" + cardnumber + "','" + pinnumber + "')";
				conn.s.executeUpdate(query);
				conn.s.executeUpdate(query1);
				//JOptionPane.showMessageDialog(null, "Card Number:"+cardnumber , "pin:"+pinnumber, defaultCloseOperation, null);
				setVisible(false);
				new Deposite(pinnumber).setVisible(false);
			}
			}
			catch (Exception e) {
				System.out.println(e);
			}
		}
		else if(ae.getSource()==cancle){
			setVisible(false);
			new Login().setVisible(true);
			
		}
	}

	public static void main(String[] args) {
		new signupthree("");
	}
	
	
}
