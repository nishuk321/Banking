import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util. *;

public class withdrawl extends JFrame implements ActionListener{
	JTextField amount;
	JButton withdraw,exit,back;
	String pinnumber;
	public withdrawl(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Enter the Amount you want to Withdraw");
		text.setBounds(180, 300, 700, 25);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,17));
		image.add(text);
		
		amount=new  JTextField();
		amount.setBounds(180,340 , 320, 30);
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(amount);
		
		withdraw =new JButton("Withdraw");
		withdraw.setBounds(355, 485, 150, 30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
		back =new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		

		setSize(900,900);
		setLocation(300,0);
		setVisible(true);}
	
	
	public static void main(String[] args) {
		new withdrawl("");
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		if(e.getSource()==withdraw)
			{
			conn c=new conn();
			int balance=0;
			try {
				ResultSet rs=c.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
			
				
				while(rs.next())		
				{
					if(rs.getString("Type").equals("Deposit")) {
						balance=balance + Integer.parseInt(rs.getString("amount"));
					}
					else {
						balance=balance - Integer.parseInt(rs.getString("amount"));
					}
				}
			
			} catch (Exception ee) {
				System.out.println(ee);
				}
			
			String paisa=amount.getText();
			Date date=new Date();
			if(paisa.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter the Amount You Want to withdraw");
			}
			
		
			else {
				int withdrawalAmount = Integer.parseInt(paisa);
				if(withdrawalAmount>balance)
				{
					 JOptionPane.showMessageDialog(null, "Insufficient Balance");
				}
				else {
				conn conn=new conn();
				String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+paisa+"') ";
				try {
					conn.s.executeUpdate(query);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Rs"+paisa+"withdraw Successfully");
				setVisible(false);
				new Transition(pinnumber).setVisible(true);
				
			}}
		}
		else if (e.getSource()==back) {
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
		}
		
	}

}
