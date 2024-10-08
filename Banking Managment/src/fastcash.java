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
import java.util.*;

import com.mysql.cj.protocol.Resultset;

public class fastcash extends JFrame implements ActionListener {
	JButton hundred,fivehundred,thousand,twothusand,tenthousand,twenty,exit;
	String pinnumber;
	
	public fastcash(String pinnumber) {
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image=new JLabel(i3);
		image.setBounds(0, 0, 900, 900);
		add(image);
		
		JLabel text=new JLabel("SELECT WITHDRAWL AMOUNT");
		text.setBounds(213, 300, 700, 35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,17));
		image.add(text);
		
		hundred =new JButton("RS 100");
		hundred.setBounds(167, 418, 150, 30);
		hundred.addActionListener(this);
		image.add(hundred);
		
		fivehundred =new JButton("RS 500");
		fivehundred.setBounds(345, 418, 150, 30);
		fivehundred.addActionListener(this);
		image.add(fivehundred);
		
		thousand =new JButton("RS 1000");
		thousand.setBounds(167, 453, 150, 30);
		thousand.addActionListener(this);
		image.add(thousand);
		
		twothusand =new JButton("RS 2000");
		twothusand.setBounds(345, 453, 150, 30);
		twothusand.addActionListener(this);
		image.add(twothusand);
		

		tenthousand =new JButton("RS 10000");
		tenthousand.setBounds(167, 488, 150, 30);
		tenthousand.addActionListener(this);
		image.add(tenthousand);
		
		twenty =new JButton("RS 20000");
		twenty.setBounds(345, 488, 150, 30);
		twenty.addActionListener(this);
		image.add(twenty);
		
		
		exit =new JButton("Back");
		exit.setBounds(345, 523, 150, 30);
		exit.addActionListener(this);
		image.add(exit);
		
	//	setUndecorated(true);
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);}
	
		
		
	
public static void main(String[] args) {
	new fastcash("");
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()==exit)
	{
		setVisible(false);
		new Transition(pinnumber).setVisible(true);
	}
	else {
		Date date=new Date();
		String amount;
		if(e.getSource()==hundred)
		{	amount="100";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
		else if(e.getSource()==fivehundred)
		{	amount="500";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
		else if(e.getSource()==thousand)
		{	amount="1000";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
		else if(e.getSource()==twothusand)
		{	amount="2000";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
		else if(e.getSource()==tenthousand)
		{	amount="10000";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
		else if(e.getSource()==twenty)
		{	amount="20000";
		
		
			conn conn=new conn();
			String query ="insert into bank values('"+pinnumber+"','"+date+"','withdrawl','"+amount+"') ";
			try {
				conn.s.executeUpdate(query);
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
			JOptionPane.showMessageDialog(null, "Rs"+amount+"withdraw Successfully");
			setVisible(false);
			new Transition(pinnumber).setVisible(true);
			
			}
	}
	
}
}
