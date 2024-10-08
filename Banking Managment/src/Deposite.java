import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util. *;

public class Deposite extends JFrame implements ActionListener{
	JTextField amount;
	JButton deposit,exit,back;
	String pinnumber;
	public Deposite(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("Enter the Amount you want to Deposit");
		text.setBounds(180, 300, 700, 25);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,17));
		image.add(text);
		
		amount=new  JTextField();
		amount.setBounds(180,340 , 320, 30);
		amount.setFont(new Font("Raleway",Font.BOLD,22));
		image.add(amount);
		
		deposit =new JButton("Deposit");
		deposit.setBounds(355, 485, 150, 30);
		deposit.addActionListener(this);
		image.add(deposit);
		
		back =new JButton("Back");
		back.setBounds(355, 520, 150, 30);
		back.addActionListener(this);
		image.add(back);
		
		

		setSize(900,900);
		setLocation(300,0);
		setVisible(true);}
	
	
	public static void main(String[] args) {
		new Deposite("");
	
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(pinnumber);
	
		if(e.getSource()==deposit)
		{
			String paisa=amount.getText();
			Date date=new Date();
			if(paisa.equals(""))
			{
				JOptionPane.showMessageDialog(null, "Please Enter the Amount You Want to deposit");
			}
			else {
				conn conn=new conn();
				String query ="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+paisa+"') ";
				try {
					conn.s.executeUpdate(query);
				} catch (SQLException e1) {
					
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "Rs"+paisa+"Deposite Successfully");
				setVisible(false);
				new Transition(pinnumber).setVisible(true);
				
			}
		}
		else if (e.getSource()==back) {
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
		}
		
	}

}
