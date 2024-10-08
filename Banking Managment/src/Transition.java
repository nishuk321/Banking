import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transition extends JFrame implements ActionListener {
	JButton deposit,withdraw,fastcash,ministatment,pinchange,balance,exit;
	String pinnumber;
	
	public Transition(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Please select your Transaction");
		text.setBounds(213, 300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,17));
		image.add(text);
		
		deposit =new JButton("Deposit");
		deposit.setBounds(167, 418, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		withdraw =new JButton("Cash Withdrawl");
		withdraw.setBounds(345, 418, 150, 30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		fastcash =new JButton("Fast Cash");
		fastcash.setBounds(167, 453, 150, 30);
		fastcash.addActionListener(this);
		image.add(fastcash);
		
		ministatment =new JButton("Mini Statment");
		ministatment.setBounds(345, 453, 150, 30);
		ministatment.addActionListener(this);
		image.add(ministatment);
		

		pinchange =new JButton("Pin Change");
		pinchange.setBounds(167, 488, 150, 30);
		pinchange.addActionListener(this);
		
		image.add(pinchange);
		
		balance =new JButton("Balance Enquiry");
		balance.setBounds(345, 488, 150, 30);
		balance.addActionListener(this);
		image.add(balance);
		
		
		exit =new JButton("Exit");
		exit.setBounds(345, 523, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
	//	setUndecorated(true);
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);}
	
		
		
	
public static void main(String[] args) {
	new Transition("");
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==exit)
	{
		System.exit(0);
	}
	else if (e.getSource()==deposit)
	{
		setVisible(false);
		new Deposite(pinnumber);
	}
	else if (e.getSource()==withdraw)
	{
		setVisible(false);
		new withdrawl(pinnumber);
	}
	else if (e.getSource()==fastcash)
	{
		setVisible(false);
		new fastcash(pinnumber);
	}
	else if (e.getSource()==pinchange) {
		
			setVisible(false);
			new pinchange(pinnumber);
		}
	else if (e.getSource()==balance) {
			
				setVisible(false);
				new balanceenqury(pinnumber);
			}
			else if (e.getSource()==ministatment) {
				{
					
					new ministatment(pinnumber);}
}
}}
