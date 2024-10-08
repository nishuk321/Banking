import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ministatment extends JFrame{
	
	String pinnumber;
	 ministatment(String pinnumber) {
		 this.pinnumber=pinnumber;
		 setLayout(null);
		 setTitle("Mini Statement");
		 
		 JLabel mini=new JLabel();
		 add(mini);
		 
		 JLabel bank=new JLabel("Indian Bank");
		 bank.setBounds(150,40,100,40);
		 add(bank);
		 
		 
		 JLabel card=new JLabel();
		 card.setBounds(20,80,300,20);
		 add(card);
		 JLabel balance=new JLabel();
		 balance.setBounds(20,400,300,20);
		 add(balance);
				 
		 int bal=0;
		 try {conn c=new conn();
		 ResultSet rs= c.s.executeQuery("select * from login where pin='"+pinnumber+"'");
			while(rs.next())
			{
				card.setText("Card Number: "+rs.getString("cardnumber").substring(0,8)+"XXXXX"+rs.getString("cardnumber").substring(13));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		 try {
			conn c=new conn();
			ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
			while(rs.next())
			{
				mini.setText(mini.getText()+"<html>"+rs.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("amount")+"<br><br><html>");
				if(rs.getString("Type").equals("Deposit")) {
					bal=bal + Integer.parseInt(rs.getString("amount"));
				}
				else {
					bal=bal - Integer.parseInt(rs.getString("amount"));
				}}balance.setText("your Current Account balance is RS "+bal);
		} catch (Exception e) {
			System.out.println(e);
		}
		 mini.setBounds(20,140,400,200);
		 setSize(400,600);
		 setLocation(20,20);
		 getContentPane().setBackground(Color.WHITE);
		 setVisible(true);
		 
		 
		 
	}
	
	
	public static void main(String[] args) {
		new ministatment("");
	}

}
